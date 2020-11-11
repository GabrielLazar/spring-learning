package com.gabriellazar.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String get(){
        return "home";
    }

    @GetMapping("/home")
    public String getHome(){
        return "home";
    }

    @GetMapping("/home/{name}")
    public String getName(@PathVariable("name") String name){
        return "home";
    }

    @GetMapping("/home")
    public String getNameByParam(@RequestParam("name") String name){
        return "home";
    }

    @GetMapping("/home")
    public String getNameByParamRequired(@RequestParam(value = "name",required = false,defaultValue = "Gabi") String name){
        return "home";
    }
}
