package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("=== Constructor Injection ===");
        College college1 = (College) context.getBean("collegeConstructor");
        college1.showStudent();

        System.out.println("=== Setter Injection ===");
        College college2 = (College) context.getBean("collegeSetter");
        college2.showStudent();
    }
}
