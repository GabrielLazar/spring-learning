package com.gabriellazar.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Gabriel");
        model.addAttribute("course","Spring Boot");

        String subject = "Thymeleaf";

        model.addAttribute("subject", subject);


       int id = new Random().nextInt(1000);
       model.addAttribute("id",id);

       List<Integer> numbers = new ArrayList<>();
       numbers.add(1);
       numbers.add(2);
       numbers.add(3);

       model.addAttribute("number",numbers);

        LocalDate lc = LocalDate.now();
        model.addAttribute("timeStamp",lc);

        return "student/welcome";
    }

}
