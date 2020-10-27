package com.gabriellazar.implementation;

import com.gabriellazar.services.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    OfficeHours hours;

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 20");
    }

    public OfficeHours getHours() {
        return hours;
    }

    //setter Injection
    @Autowired
    public void setHours(OfficeHours hours) {
        this.hours = hours;
    }
}
