package com.gabriellazar.implementation;

import com.gabriellazar.services.Course;
import org.springframework.stereotype.Component;


public class Java implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Teaching hours : 20");
    }
}
