package com.mondris.soap.demo.Services;

import com.mondris.soap.demo.DTO.NumberDto;
import com.mondris.soap.demo.util.ApiResponse;
import com.mondris.soap.demo.util.Helper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
@Slf4j
public class RestTemplateDemo {
    @Autowired
    Helper helper;
    // method to and two numbers
    public ResponseEntity<ApiResponse> addition(NumberDto numberDto)  throws Exception {
        return  helper.executeRestTemplateReq(numberDto, "Add");
    }

    // method to multiply two numbers
    public ResponseEntity<ApiResponse> multiplication(NumberDto numberDto) throws Exception {
        return helper.executeRestTemplateReq(numberDto, "Multiply");
    }

    // method to divide a number
    public ResponseEntity<ApiResponse>  division(NumberDto numberDto) throws Exception {
        if (numberDto.getNumb2() == 0){
            ApiResponse apiResponse =  new ApiResponse();
            apiResponse.setError("You cannot divide a number by zero");
            apiResponse.setStatusCode(HttpStatus.PRECONDITION_FAILED.value());
            apiResponse.setResponseStatus("Failed");
            return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.valueOf(apiResponse.getStatusCode())) ;
        } else {
            return helper.executeRestTemplateReq(numberDto, "Divide");
        }
    }

    // method to divide a number
    public ResponseEntity<ApiResponse> subtraction(NumberDto numberDto) throws Exception {
        return helper.executeRestTemplateReq(numberDto, "Subtract");
    }
}
