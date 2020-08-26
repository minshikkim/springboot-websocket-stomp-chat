package com.example.springchat.controllers;


import com.example.springchat.model.UserInfo;
import jdk.jfr.ContentType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class pageController {

    @GetMapping("/")
    public String main2() {
        return "index2";
    }


}
