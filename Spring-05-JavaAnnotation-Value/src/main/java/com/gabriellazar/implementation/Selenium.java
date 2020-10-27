package com.gabriellazar.implementation;

import com.gabriellazar.services.Course;
import com.gabriellazar.services.ExtraSessions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {


    ExtraSessions extraSessions;


    //constructor dependency injection
    public Selenium( @Qualifier("homeHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 20");
    }


}
