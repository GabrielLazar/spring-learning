package com.gabriellazar.implementation;

import com.gabriellazar.services.Course;


public class Java implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching Hours: " + (20));
    }


}
