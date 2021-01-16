package com.gabriellazar.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class ProfileController {


    @GetMapping("/index")
    public String getIndex(){
        return "profile/index";
    }
}
