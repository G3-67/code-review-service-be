package com.example.codereviewservice.controller;

import com.example.codereviewservice.client.HelloWorldClient;
import com.example.codereviewservice.dto.CodeReviewRequest;
import com.example.codereviewservice.service.AiCodeReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")

public class CodeReviewController {
        @Autowired
        private AiCodeReviewService service;

        private final HelloWorldClient helloWorldClient;

    public CodeReviewController(HelloWorldClient helloWorldClient) {
        this.helloWorldClient = helloWorldClient;
    }
    @PostMapping("/review")
    public String reviewCode(@RequestBody CodeReviewRequest request) {
        return service.reviewCode(
                request.getLanguage(),
                request.getCode()
        );
    }
//    @GetMapping("/hello")
//    public String review() {
//        String helloMessage = client.getHello();
//        return "Code Review Service is running! Also got: " + helloMessage;
//    }

    @GetMapping("/service")
    public String review() {
        // Call Hello World Service
        String helloMessage = helloWorldClient.getHello();
        return "Code Review Service got: " + helloMessage;
    }


}
