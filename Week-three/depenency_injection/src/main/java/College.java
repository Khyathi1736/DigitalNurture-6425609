package com.example;

public class College {
    private Student student;

    // Constructor Injection
    public College(Student student) {
        this.student = student;
    }

    // Setter Injection
    public void setStudent(Student student) {
        this.student = student;
    }

    public void showStudent() {
        student.display();
    }
}
