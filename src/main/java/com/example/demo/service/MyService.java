package com.example.demo.service;

import com.example.demo.daoMapper.MybatisMapper;
import com.example.demo.pojo.Uers01;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    @Resource
    private MybatisMapper mybatisMapper;
    //    用户名登录
    public List<Uers01> userNameLogin(String userName, String password)
    {
        List<Uers01> listUserName=mybatisMapper.selectUserName(userName,password);
        List<Uers01> listUserCell=mybatisMapper.selectUserCell(userName,password);
        if(!listUserName.isEmpty()){
            return listUserName;
        }
        else if (!listUserCell.isEmpty()){
            return listUserCell;
        }else {
            return null;
        }
    }
//    用户注册
    public int userEnroll(String userName, String password, String cell)
    {
        return mybatisMapper.insertEnroll(userName,password,cell);
    }
}
