package com.example.demo.daoMapper;

import com.example.demo.pojo.Uers01;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MybatisMapper
{
//    用户名登录 查询
    public List<Uers01> selectUserName(String userName,String password);
//    手机号登录 查询
    public List<Uers01> selectUserCell(String userName,String password);
//    用户注册
    public int insertEnroll(String userName,String password,String cell);
}
