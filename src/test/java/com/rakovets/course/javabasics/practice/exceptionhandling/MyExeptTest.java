package com.rakovets.course.javabasics.practice.exceptionhandling;

public class MyExeptTest {
    public static void main(String[]args) {

        ExistsChar obj = new ExistsChar();
        try {
            int  cus = obj.getExistsChar("Home work",'d');
        } catch (CharException e) {
            e.printStackTrace();
        }
    }
}
