package com.mondris.soap.demo.Services;

import com.mondris.soap.demo.DTO.NumberDto;
import com.mondris.soap.demo.util.ApiResponse;
import com.mondris.soap.demo.util.Helper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HttpUrlConnectionSoapDemo {
    // method to and two numbers
    public ResponseEntity<ApiResponse> addition(NumberDto numberDto)   {
        return Helper.executeHttpUrlRequest(numberDto, "Add");
    }

    // method to multiply two numbers
    public ResponseEntity<ApiResponse> multiplication(NumberDto numberDto){
       return Helper.executeHttpUrlRequest(numberDto, "Multiply");
    }

    // method to divide a number
    public ResponseEntity<ApiResponse> division(NumberDto numberDto) {
        if (numberDto.getNumb2() == 0){
            ApiResponse apiResponse = new ApiResponse();
            apiResponse.setStatusCode(HttpStatus.PRECONDITION_FAILED.value());
            apiResponse.setError("You cannot divide a number by zero");
            apiResponse.setResponseStatus("Failed");
            return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.valueOf(apiResponse.getStatusCode()));
        } else {
            return Helper.executeHttpUrlRequest(numberDto, "Divide");
        }
    }

    // method to divide a number
    public ResponseEntity<ApiResponse> subtraction(NumberDto numberDto)  {
            return Helper.executeHttpUrlRequest(numberDto, "Subtract");
    }

}
