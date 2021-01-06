package com.mondris.soap.demo.Controllers;

import com.mondris.soap.demo.DTO.NumberDto;
import com.mondris.soap.demo.Services.RestTemplateDemo;
import com.mondris.soap.demo.util.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RestTemplateController {
    @Resource
    private RestTemplateDemo restTemplateDemo;

//    // route for addition
    @PostMapping("/restTemplate/add")
    public ResponseEntity<ApiResponse> addNumbers(@RequestBody NumberDto number) throws Exception {
        return restTemplateDemo.addition(number);
    }

    // route for multiplication
    @PostMapping("/restTemplate/multiply")
    public ResponseEntity<ApiResponse> multiplyNumbers(@RequestBody NumberDto numberDto) throws Exception {
        return restTemplateDemo.multiplication(numberDto);
    }
    // route for division
    @PostMapping("/restTemplate/divide")
    public ResponseEntity<ApiResponse> divideNumber(@RequestBody NumberDto numberDto) throws Exception {
        return  restTemplateDemo.division(numberDto);
    }

    // route for subtraction
    @PostMapping("/restTemplate/subtraction")
    public ResponseEntity<ApiResponse> subtraction(@RequestBody NumberDto numberDto) throws Exception {
        return  restTemplateDemo.subtraction(numberDto);
    }
}
