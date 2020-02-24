package com.study.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MessageController
 * @Description TODO
 * @Author 网易云课堂微专业-java高级开发工程师
 * @Date 2020/2/24 15:47
 * @Version 1.0
 */
@RestController
public class MessageController {

    @Value("${server.port}")
    String port;

    @GetMapping("/get")
    public String getMessage(@RequestParam("name")String name){
        return "Hi " + name + " ,I am from port:" + port;
    }

}