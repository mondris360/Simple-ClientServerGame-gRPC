package com.mondris.soap.demo.util;

import com.mondris.soap.demo.DTO.NumberDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
@Service
public class Helper {
    @Autowired
    private RestTemplate restTemplate;
    private static final String soapServiceUrl =  "http://www.dneonline.com/calculator.asmx";
    private ResponseEntity<ApiResponse> responseResponseEntity;
    // method to execute HttpUrlConnection Request
    public static ResponseEntity<ApiResponse> executeHttpUrlRequest(NumberDto number, String operator) {
        ApiResponse apiResponse =  new ApiResponse();
        HttpURLConnection httpUrlConnection;

        String xmlReqPayloadStr = String.format("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Body>\n" +
                "    <%s xmlns=\"http://tempuri.org/\">\n" +
                "      <intA>%d</intA>\n" +
                "      <intB>%d</intB>\n" +
                "    </%s>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>", operator, number.getNumb1(), number.getNumb2(), operator);

        try {
            // convert the reqPayload str to byte array
            byte[] reqPayloadToByte =  xmlReqPayloadStr.getBytes();
            // prepare the connection
            URL url =  new URL(soapServiceUrl);
            httpUrlConnection = (HttpURLConnection) url.openConnection();
            httpUrlConnection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
            httpUrlConnection.setRequestProperty("Content-Length", String.valueOf(reqPayloadToByte.length));
            httpUrlConnection.setRequestProperty("SOAPAction", "http://tempuri.org/" + operator);
            httpUrlConnection.setRequestMethod("POST");
            // use the url connection to send output
            httpUrlConnection.setDoOutput(true);
            // use the url connection to read input
            httpUrlConnection.setDoInput(true);

            // get the connection output stream
            OutputStream outputStream =  httpUrlConnection.getOutputStream();
            // write the req payload to the output stream
            outputStream.write(reqPayloadToByte);
            outputStream.flush();
            int statusCode =  httpUrlConnection.getResponseCode();
            if(statusCode>= 200 && statusCode < 300) {
                InputStream inputStream =  httpUrlConnection.getInputStream();
                apiResponse =  readStream(inputStream, operator, statusCode);
            } else if (statusCode >= 300 && statusCode <500) {
                InputStream errorStream =  httpUrlConnection.getErrorStream();
                apiResponse =  readStream(errorStream, operator, statusCode);
            }
        } catch (MalformedURLException e) {
            apiResponse =  setApiResponse(null, e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(),"Failed" );
            log.warn(e.getMessage());

        } catch(IOException e) {
            apiResponse =  setApiResponse(null, e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(),"Failed" );
            log.info(e.getMessage());

        } catch (Exception e){
            apiResponse =  setApiResponse(null, e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(),"Failed" );
            log.info(e.getMessage());
        }
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.valueOf(apiResponse.getStatusCode())) ;
    }

//    // method to execute rest template  request
    public ResponseEntity<ApiResponse> executeRestTemplateReq(NumberDto number, String operator) throws Exception {
        ApiResponse apiResponse;
        // request payload xml
        String xmlReqPayloadStr = String.format("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Body>\n" +
                "    <%s xmlns=\"http://tempuri.org/\">\n" +
                "      <intA>%d</intA>\n" +
                "      <intB>%d</intB>\n" +
                "    </%s>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>", operator, number.getNumb1(), number.getNumb2(), operator);

        // prepare the rest template connection
        HttpHeaders httpHeaders =  new HttpHeaders();
        httpHeaders.setContentType(MediaType.TEXT_XML);
        // create the Request Entity
       HttpEntity<String> httpEntity =  new HttpEntity<String>(xmlReqPayloadStr, httpHeaders);
       ResponseEntity<String>  response =  restTemplate.exchange(soapServiceUrl, HttpMethod.POST, httpEntity, String.class);
       int statusCode =  response.getStatusCode().value();
        apiResponse = filterAnswerFromXmlResponseStr(response.getBody(), operator, statusCode);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.valueOf(apiResponse.getStatusCode()));
    }
//
//    // method to read api response from input stream and filter the actual answer value
    private static ApiResponse readStream(InputStream stream, String operator, int statusCode)  {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
        StringBuilder responseData =  new StringBuilder();
        ApiResponse apiResponse =  new ApiResponse();

        // read the response body from the buffer
        try {
            String line =  bufferedReader.readLine();
            while(line != null){
                responseData.append(line);
                // read the next line
                line =  bufferedReader.readLine();
            }
            // filter the actual response value from the api response xml
            apiResponse = filterAnswerFromXmlResponseStr(responseData.toString(),operator,statusCode);
        } catch (IOException e)  {
           apiResponse.setError(e.getMessage());
           apiResponse.setStatusCode(statusCode);
           log.info(e.getMessage());
        }
        return apiResponse;
    }

    // method to filter answer from xml response
    private static   ApiResponse filterAnswerFromXmlResponseStr(String xmlResponseStr, String operator, int statusCode) {
        ApiResponse apiResponse;
        String response = null;
        try {
            DocumentBuilderFactory documentBuilderFactory =  DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder documentBuilder =  documentBuilderFactory.newDocumentBuilder();
            // read the xml response str
            InputSource inputSource =  new InputSource(new StringReader(xmlResponseStr));
            // converts the xml to document module of nodes
            final Document document = documentBuilder.parse(inputSource);
            //extract the node that contains the actual response value from the document object module
            NodeList nodeList =  document.getElementsByTagName(operator+ "Result");
            response =  nodeList.item(0).getTextContent();
            // check if we are parsing an error response or a success response
            if (statusCode>=300){
                apiResponse =  setApiResponse(null, response, statusCode, "Failed" );
            } else {
                apiResponse =  setApiResponse(response, null,statusCode, "Successful" );
            }
        }catch (ParserConfigurationException | SAXException | IOException e) {
            log.info(e.getMessage());
            apiResponse = setApiResponse(null, e.getMessage(), statusCode, "Failed");

        }
        return apiResponse;
    }

    // method to set api response object
    private static ApiResponse setApiResponse(String answer, String error, int statusCode, String responseStatus){
        ApiResponse apiResponse =  new ApiResponse();
        apiResponse.setAnswer(answer);
        apiResponse.setError(error);
        apiResponse.setStatusCode(statusCode);
        apiResponse.setResponseStatus(responseStatus);
        return apiResponse;
    }

//    private static ApiResponse readStream(InputStream stream, String operator, int statusCode)  {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
//        StringBuilder responseData =  new StringBuilder();
//        ApiResponse apiResponse =  new ApiResponse();
//
//        // read the response body from the buffer
//        try {
//            String line =  bufferedReader.readLine();
//            while(line != null){
//                responseData.append(line);
//                // read the next line
//                line =  bufferedReader.readLine();
//            }
//            apiResponse.setAnswer(responseData.toString());
//            apiResponse.setStatusCode(statusCode);
//        } catch (IOException e)  {
//            apiResponse.setError(e.getMessage());
//            apiResponse.setStatusCode(statusCode);
//            log.info(e.getMessage());
//        }
//        return apiResponse;
//    }
}
