package com.gabriellazar.implementation;

import com.gabriellazar.services.Course;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Java implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Teaching Hours: 30");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Executing post Construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Executing pre Destroy");
    }
}
