package com.example.codereviewservice.dto;

import lombok.Data;

@Data
public class SimplePRRequest {
    private String githubToken;
    private int prNumber;
    private String repoName;
    private String repoOwner;
}
