package com.gabriellazar.implementation;


import com.gabriellazar.services.Course;
import com.gabriellazar.services.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    //field injection
    @Autowired
    ExtraSessions extraSessions;

    /*
    //constructor injection
    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

     */

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours " + (30 + extraSessions.getHours()));
    }


}
