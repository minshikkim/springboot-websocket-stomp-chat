package com.example.springchat.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pageController {
    @RequestMapping("/login")
    public String signUp(){
        return "login";
    }
}
