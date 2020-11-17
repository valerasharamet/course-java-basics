package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task4Test {
    public static void main(String[]args) {
        Task4 task4 = new Task4();
        String[] strArr = new String[3];
        try {
            task4.addStr(strArr,4);
        } catch (ExeptTask4 e) {
            e.getMessage();
            e.printStackTrace();

        }
    }
}
