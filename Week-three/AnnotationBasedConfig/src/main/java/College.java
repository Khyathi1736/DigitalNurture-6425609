package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {

    @Autowired
    private Student student;

    public void showStudent() {
        student.display();
    }
}
