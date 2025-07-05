package com.example;

public class Student {
    private String name;

    public Student() {}

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
