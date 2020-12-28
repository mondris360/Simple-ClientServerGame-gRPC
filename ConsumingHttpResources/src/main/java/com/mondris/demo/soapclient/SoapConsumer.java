package com.mondris.demo;

import com.mondris.demo.soap.classes.Acknowledgement;
import com.mondris.demo.soap.classes.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapConsumer {
    @Autowired
    private Jaxb2Marshaller marshaller;
    private WebServiceTemplate webServiceTemplate;

    public Acknowledgement getLoanStatus(CustomerRequest request){
        webServiceTemplate = new WebServiceTemplate(marshaller);
        // make a call to the saop api
        Acknowledgement acknowledgement = (Acknowledgement) webServiceTemplate.marshalSendAndReceive("http://localhost:8080/ws", request);
        return  acknowledgement;
    }
}
