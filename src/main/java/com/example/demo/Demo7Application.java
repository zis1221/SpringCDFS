package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import javax.swing.*;

// 该注解表示 @SpringBootConfiguration本身就是一个配置类；@EnableAutoConfiguration 注解的作用设置加载容器 @Configuration 注解会扫描当前类路径下的所有配置类，并将其注册到Spring容器中。
@SpringBootApplication
@EnableRedisHttpSession
//@MapperScan("com.example.demo.daoMapper")
public class Demo7Application {

    public static void main(String[] args)
    {
        SpringApplication.run(Demo7Application.class,args);
    }
}
