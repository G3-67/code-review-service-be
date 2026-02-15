package com.example.codereviewservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.codereviewservice.client")
public class CodeReviewServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeReviewServiceApplication.class, args);
    }

}
