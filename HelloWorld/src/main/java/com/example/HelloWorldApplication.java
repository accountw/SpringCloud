package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author accountw
 * @date 2020-06-03 15:42
 * @description: 启动项
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HelloWorldApplication {
    public static void  main(String[] args){
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
