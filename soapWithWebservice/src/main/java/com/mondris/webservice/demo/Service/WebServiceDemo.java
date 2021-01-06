package com.mondris.webservice.demo.Service;

import com.mondris.webservice.demo.BindingClasses.Add;
import com.mondris.webservice.demo.BindingClasses.AddResponse;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.annotation.Resource;

@Service
public class WebServiceDemo {
    @Resource
    private Jaxb2Marshaller marshaller;
    private static final String soapServiceUrl =  "http://www.dneonline.com/calculator.asmx";

    public AddResponse addTwoNumbers(Add request)  {
        // config the template to use the marshaller will created for xml to java class conversion
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate(marshaller);
        // make the call to the soap service
        return (AddResponse) webServiceTemplate.marshalSendAndReceive(soapServiceUrl, request);
    }
}
