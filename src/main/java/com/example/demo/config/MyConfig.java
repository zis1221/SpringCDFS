package com.example.demo.config;

import com.example.demo.intercept.MyIntercept;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyConfig implements WebMvcConfigurer
{
//    拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(new MyIntercept());
    }
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")   //定义CORS映射 适用于所有路径
                .allowedOrigins("http://localhost:8080")  //指定被允许的访问源
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  //指定请求方式
                .allowedHeaders("*")
                .allowCredentials(true);  // 允许携带cookie和认证信息
    }
}
