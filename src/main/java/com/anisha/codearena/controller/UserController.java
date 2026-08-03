package com.anisha.codearena.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/user/profile")
    public Map<String, Object> profile(Authentication authentication) {

        Map<String, Object> response = new HashMap<>();

        response.put("email", authentication.getName());

        response.put("message", "Welcome to CodeArena!");

        return response;
    }
}