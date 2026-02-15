package com.example.codereviewservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "PRCODEREVIEW", url = "http://localhost:4000")
public interface HelloWorldClient {
    @GetMapping("/hello")
    String getHello();
}
