package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author accountw
 * @date 2020-06-03 23:36
 * @description:
 */
@RestController
@RefreshScope
public class MainController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${server-url}")
    private String serverurl;

    @GetMapping(value = "/ceshi",name = "/测试")
    public String ceshi(){
       return restTemplate.getForObject(serverurl+"/getCeshi",String.class);
    }
}
