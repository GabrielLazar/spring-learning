package com.gabriellazar;


import com.gabriellazar.services.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Course course = context.getBean("java",Course.class);


        course.getTeachingHours();
    }

}
