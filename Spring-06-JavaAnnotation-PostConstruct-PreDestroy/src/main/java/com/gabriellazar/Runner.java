package com.gabriellazar;

import com.gabriellazar.config.AppConfig;
import com.gabriellazar.services.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Course course = context.getBean("java",Course.class);

        course.getTeachingHours();

        ((AnnotationConfigApplicationContext)context).close();
    }
}
