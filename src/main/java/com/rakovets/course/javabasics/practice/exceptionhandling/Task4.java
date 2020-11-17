package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task4 {

    public void addStr(String[] str, int idx) throws ExeptTask4 {
        if (idx > str.length) {
            throw new ExeptTask4("RunTime");
        } else {
            str[idx] = "Wow";
        }
    }
}
