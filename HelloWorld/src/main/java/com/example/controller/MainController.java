package com.example.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author accountw
 * @date 2020-06-03 17:49
 * @description: 测试
 */
@RestController
@RefreshScope
public class MainController {

    @Value("${server.port}")
    private String port;


    @Value("${name}")
    private String name;

    @GetMapping(value = "/getCeshi",name = "测试")
    public String ceshi(){
        return "hello nacos"+port+":"+name;
    }
}
