package com.gabriellazar.implementation;

import com.gabriellazar.services.Course;
import com.gabriellazar.services.ExtraHours;

public class Java implements Course {

    ExtraHours extraHours;

    public Java(ExtraHours extraHours) {
        this.extraHours = extraHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching Hours: " + (20 + extraHours.getHours()));
    }
}
