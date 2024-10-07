package com.example.demo.response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class LoginEnroll
{
    private  Map<String, String> loginEnrollResponse=new HashMap<>();
    private  ObjectMapper objectMapper=new ObjectMapper();
    public String getResponseProper() throws JsonProcessingException {
        loginEnrollResponse.put("响应","1");
        return objectMapper.writeValueAsString(loginEnrollResponse);
    }
    public String getResponseError() throws JsonProcessingException {
        loginEnrollResponse.put("响应","0");
        return objectMapper.writeValueAsString(loginEnrollResponse);
    }
}
