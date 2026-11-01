package com.example.codereviewservice.dto;

import lombok.Data;

@Data
public class SimplePRResponse {
    private String review;  // e.g. "approve/request_changes with comments"

    // getters and setters
}
