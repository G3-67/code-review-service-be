package com.example.codereviewservice.client;

import com.example.codereviewservice.dto.SimplePRRequest;
import com.example.codereviewservice.dto.SimplePRResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "PRCODEREVIEW", url = "http://localhost:4000")
public interface HelloWorldClient {
    @GetMapping("/hello")
    String getHello();
    @PostMapping("/reviewPr")
    SimplePRResponse reviewPR(@RequestBody SimplePRRequest request);


}
