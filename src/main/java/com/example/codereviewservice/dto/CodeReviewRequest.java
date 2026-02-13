package com.example.codereviewservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CodeReviewRequest {

    private String language;
    private String code;
}
