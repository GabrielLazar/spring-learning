package com.gabriellazar.implementation;


import com.gabriellazar.services.Course;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours");
    }


}
