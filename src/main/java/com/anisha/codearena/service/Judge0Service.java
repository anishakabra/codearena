package com.anisha.codearena.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Judge0Service {

    @Autowired
    private RestTemplate restTemplate;

    private static final String JUDGE0_URL =
            "https://judge0-ce.p.rapidapi.com/submissions?base64_encoded=false&wait=false";

}