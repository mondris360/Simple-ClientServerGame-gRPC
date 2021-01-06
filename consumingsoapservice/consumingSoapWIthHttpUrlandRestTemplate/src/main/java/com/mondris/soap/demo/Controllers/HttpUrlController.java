package com.mondris.soap.demo.Controllers;

import com.mondris.soap.demo.DTO.NumberDto;
import com.mondris.soap.demo.Services.HttpUrlConnectionSoapDemo;
import com.mondris.soap.demo.util.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HttpUrlController {
    @Resource
    private HttpUrlConnectionSoapDemo httpUrlConnectionSoapDemo;

    // route for addition
    @PostMapping("/httpUrlConnection/add")
    public ResponseEntity<ApiResponse> addNumbers(@RequestBody NumberDto number) {
        return httpUrlConnectionSoapDemo.addition(number);
    }

    // route for multiplication
    @PostMapping("/httpUrlConnection/multiply")
    public ResponseEntity<ApiResponse> multiplyNumbers(@RequestBody NumberDto numberDto) {
        return httpUrlConnectionSoapDemo.multiplication(numberDto);
    }
    // route for division
    @PostMapping("/httpUrlConnection/divide")
    public ResponseEntity<ApiResponse> divideNumber(@RequestBody NumberDto numberDto) {
        return  httpUrlConnectionSoapDemo.division(numberDto);
    }

    // route for subtraction
    @PostMapping("/httpUrlConnection/subtraction")
    public ResponseEntity<ApiResponse> subtraction(@RequestBody NumberDto numberDto)  {
        return  httpUrlConnectionSoapDemo.subtraction(numberDto);
    }
}
