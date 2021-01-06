package com.mondris.soap.demo.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class ApiResponse {
    private Object answer;
    private int  statusCode;
    private  String responseStatus;
    private String error;
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
}

