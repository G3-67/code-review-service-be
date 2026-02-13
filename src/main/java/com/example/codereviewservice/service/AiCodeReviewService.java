package com.example.codereviewservice.service;


import org.jspecify.annotations.Nullable;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.retry.NonTransientAiException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.Map;

@Service
public class AiCodeReviewService {

    private final ChatModel chatModel;

    public AiCodeReviewService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String reviewCode(String language, String code) {

        String prompt = """
            Review the following %s code.
            Provide issues, improvements, and best practices.

            Code:
            %s
            """.formatted(language, code);

        return chatModel.call(prompt); // ✅ THIS IS CORRECT
    }
    }

