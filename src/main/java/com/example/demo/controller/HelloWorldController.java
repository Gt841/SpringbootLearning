package com.example.demo.controller;
//基础入门
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController 修饰该Controller所有的方法返回Json格式，可以当作Restful接口
 * EnableAutoConfiguration 让SpringBoot根据应用所声明的依赖对Spring框架进行配置
 */
@RestController
@EnableAutoConfiguration
public class HelloWorldController {
    /**
     * RequestMapping 标识请求地址
     * 测试方法
     * @return String
     */
    @RequestMapping("/hello")
    public String Hello(){
        return "hello Spring!";
    }

    /**
     * 标识为启动类
     * @param args
     */
    public static void main(String[] args){
        SpringApplication.run(HelloWorldController.class, args);
    }

}
