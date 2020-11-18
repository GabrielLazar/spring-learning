package com.gabriellazar.controller.controller;

import com.gabriellazar.controller.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
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

       model.addAttribute("numbers",numbers);

        LocalDate lc = LocalDate.now();
        model.addAttribute("timeStamp",lc);

        Student student = new Student(1,"Gabi","Lazar");
        model.addAttribute("student", student);

        return "student/welcome";
    }

    @GetMapping("/register")
    public String student2(Model model){
        return "student/register";
    }

}
