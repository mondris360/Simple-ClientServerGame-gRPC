package com.mondris.soap.demo.Services;

import com.mondris.soap.demo.util.ReadStreamData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.HttpServerErrorException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
public class HttpUrlConnectionSoapDemo {

    public int addNumbers(int numb1, int numb2)  {
        HttpURLConnection httpUrlConnection;
        String soapServiceUrl =  "http://calculator-webservice.mybluemix.net/calculator";
        String responseData;
        try {
            // request payload
                String xmlReqPayloadStr = String.format("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                        "  <soap:Body>\n" +
                        "    <Add xmlns=\"http://tempuri.org/\">\n" +
                        "      <intA>%d</intA>\n" +
                        "      <intB>%d</intB>\n" +
                        "    </Add>\n" +
                        "  </soap:Body>\n" +
                        "</soap:Envelope>", numb1, numb2);

                // convert the reqPayload str to byte array
                byte[] reqPayloadToByte =  xmlReqPayloadStr.getBytes();
                System.out.println("requestXml");
                // prepare the connection
                URL url =  new URL(soapServiceUrl);
                httpUrlConnection = (HttpURLConnection) url.openConnection();
                httpUrlConnection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
                httpUrlConnection.setRequestProperty("Content-Length", String.valueOf(reqPayloadToByte.length));
                httpUrlConnection.setRequestProperty("SOAPAction", "http://tempuri.org/Add");
                httpUrlConnection.setRequestMethod("Post");
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
                    responseData =  ReadStreamData.readStream(inputStream);
                } else if (statusCode >= 300 && statusCode <500) {
                    InputStream errorStream =  httpUrlConnection.getErrorStream();
                    responseData =  ReadStreamData.readStream(errorStream);
                } else {
                    responseData = "Internal Server Error";
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
                throw new IllegalAccessException("dddddd");

            } catch(IOException e) {
                e.getMessage()
            } catch (HttpServerErrorException.InternalServerError)
        return 0;
    }
}
