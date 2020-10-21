package com.gabriellazar;

import com.gabriellazar.services.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Course course2 = context.getBean("java", Course.class);

        Course course1 = context.getBean("java", Course.class);

        System.out.println("Pointing to the same: " + (course1 == course2));

        Course course3 = context.getBean("selenium", Course.class);

        Course course4 = context.getBean("selenium", Course.class);

        System.out.println("Scope object are different.: " + (course3 == course4));
    }

}
