package com.rakovets.course.javabasics.practice.exceptionhandling;

public class ExeptTask4 extends  RuntimeException{
    private String message;
    public ExeptTask4 (String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }


}
