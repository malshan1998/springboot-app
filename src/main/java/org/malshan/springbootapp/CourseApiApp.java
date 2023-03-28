package org.malshan.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // To tell SpringBoot that this is the starting point of the SB application
public class CourseApiApp {
    public static void main(String[] args) {

        // To create a servlet container (Tomcat) and host the app in that
        SpringApplication.run(CourseApiApp.class, args);
    }
}
