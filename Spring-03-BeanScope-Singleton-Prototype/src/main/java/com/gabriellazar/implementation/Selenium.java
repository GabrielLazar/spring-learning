package com.gabriellazar.implementation;

import com.gabriellazar.services.Course;

public class Selenium implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Some hours...");
    }
}
