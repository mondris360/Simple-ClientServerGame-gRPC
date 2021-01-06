package com.mondris.soap.demo.util;

import lombok.extern.slf4j.Slf4j;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

@Slf4j
public class ReadStreamData {

    public static String readStream(InputStream stream) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
        StringBuilder responseData =  new StringBuilder();

        // read the response body from the buffer
        String line =  bufferedReader.readLine();
        while(line != null){
            responseData.append(line);
            // read the next line
            line =  bufferedReader.readLine();
        }

        return filterResValueFromXmlResponseString(responseData.toString());
    }

    // method to filter response data form  xml response string
    private  static String filterResValueFromXmlResponseString(String xmlResponseStr) throws Exception  {
        String answer;
        try {
            DocumentBuilderFactory documentBuilderFactory =  DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder documentBuilder =  documentBuilderFactory.newDocumentBuilder();
            // read the xml response str
            InputSource inputSource =  new InputSource(new StringReader(xmlResponseStr));
            // converts the xml to document module of nodes
            final Document document = documentBuilder.parse(inputSource);
            //extract the node that contains the actual response value from the document object module
            NodeList nodeList =  document.getElementsByTagName("AddResult");
            answer =  nodeList.item(0).getTextContent();
        }catch (ParserConfigurationException e) {
            log.info(e.getMessage());
            throw new ParserConfigurationException(e.getMessage());
        }catch (SAXException e) {
            log.info(e.getMessage());
            throw new SAXException(e.getMessage());
        }
        return answer;
    }
}
