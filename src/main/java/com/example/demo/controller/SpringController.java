package com.example.demo.controller;

import com.example.demo.api.SmsVerification;
import com.example.demo.common.UserEnroll;
import com.example.demo.common.UserLogin;
import com.example.demo.pojo.Uers01;
import com.example.demo.response.LoginEnroll;
import com.example.demo.service.MyService;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpringController
{
    private LoginEnroll loginEnroll=new LoginEnroll();
    @Autowired
    private HttpSession session;
    @Resource
    private MyService myService;


    @GetMapping("helloBoot")
    public String helloBoot()
    {
        return "你好，SpringBoot！";
    }
//    注册
    @PostMapping("enroll")
    public ResponseEntity<String> enroll(@RequestBody UserEnroll userEnroll) throws JsonProcessingException {
        if ((myService.userEnroll(userEnroll.getUserName(), userEnroll.getPassword(), userEnroll.getCell()))==1){
            session.setAttribute("userName",userEnroll.getUserName());
            session.setAttribute("cell",userEnroll.getCell());
            String json= loginEnroll.getResponseProper();
            return new ResponseEntity<String>(json, HttpStatus.OK);
        }
        else{
            String json= loginEnroll.getResponseError();
            return new ResponseEntity<String>(json, HttpStatus.OK);
        }
    }

//    登录
    @PostMapping("username")
    public ResponseEntity<String> uersname(@RequestBody UserLogin userLogin) throws Exception {
        List<Uers01> listLogin;
        if ((listLogin=myService.userNameLogin(userLogin.getUserName(),userLogin.getPassword()))!=null){
            session.setAttribute("userName",listLogin.get(0).getUserName());
            session.setAttribute("cell",listLogin.get(0).getCell());
            System.out.println("session=="+session.getAttribute("userName")+session.getAttribute("cell"));
            String json= loginEnroll.getResponseProper();
            return new ResponseEntity<String>(json, HttpStatus.OK);
        }
        else {
            String json= loginEnroll.getResponseError();
            return new ResponseEntity<String>(json, HttpStatus.OK);
        }
    }

}
