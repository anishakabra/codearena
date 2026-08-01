package com.anisha.codearena.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @GetMapping("/user/profile")
    public String userProfile() {
        return "Welcome User!";
    }

}