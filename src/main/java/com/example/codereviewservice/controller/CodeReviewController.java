package com.example.codereviewservice.controller;

import com.example.codereviewservice.dto.CodeReviewRequest;
import com.example.codereviewservice.dto.CodeReviewResponse;
import com.example.codereviewservice.service.AiCodeReviewService;
import org.springframework.ai.mistralai.api.MistralAiApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/api/review")
@CrossOrigin(
        origins = "http://localhost:5173",
        allowedHeaders = "*",
        methods = {RequestMethod.POST, RequestMethod.OPTIONS}
)


public class CodeReviewController {
        @Autowired
        private AiCodeReviewService service;
    @PostMapping
    public String reviewCode(@RequestBody CodeReviewRequest request) {
        return service.reviewCode(
                request.getLanguage(),
                request.getCode()
        );
    }

}
