package com.example;

public class MessageService {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Message: " + message);
    }
}
