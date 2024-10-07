package com.example.demo.intercept;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

// 拦截器
public class MyIntercept implements HandlerInterceptor {
    //    总拦截器 默认拦截所有
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
    {
        System.out.println("拦截成功！！！");
        System.out.println(1111);
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
//        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Type", "application/json;charset=UTF-8");
        System.out.println("响应数据处理！！！");
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
//        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Type", "application/json;charset=UTF-8");
        System.out.println("总处理！！！");
    }

}
