package com.gabriellazar.demo.controller;

import com.gabriellazar.demo.model.Gender;
import com.gabriellazar.demo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/list")
    public String getMentors(Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Ruslan","C",20, Gender.MALE));
        mentorList.add(new Mentor("Mada","Bal",36,Gender.FEMALE));

        model.addAttribute("mentors",mentorList);

        return "mentor/mentor";

    }
}
