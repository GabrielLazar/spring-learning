package com.gabriellazar.implementation;


import com.gabriellazar.services.Course;
import com.gabriellazar.services.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Value("${instructor}")
    private String instructor;

    //field injection
    @Autowired
    @Qualifier("officeHours")
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
        System.out.println(instructor);
    }


}
