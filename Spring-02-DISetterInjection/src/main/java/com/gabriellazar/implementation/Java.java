package com.gabriellazar.implementation;

import com.gabriellazar.services.Course;
import com.gabriellazar.services.ExtraHours;

public class Java implements Course {

    ExtraHours extraHours;


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching Hours: " + (20 + extraHours.getHours()));
    }

    public ExtraHours getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(ExtraHours extraHours) {
        this.extraHours = extraHours;
    }
}
