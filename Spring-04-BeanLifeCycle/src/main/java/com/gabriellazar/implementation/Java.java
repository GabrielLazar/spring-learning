package com.gabriellazar.implementation;


import com.gabriellazar.services.Course;

public class Java implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours");
    }

    public void myInitMethod(){
        System.out.println("Executing init method");
    }

    public void myDistroyMethod(){
        System.out.println("My destroy method");
    }
}
