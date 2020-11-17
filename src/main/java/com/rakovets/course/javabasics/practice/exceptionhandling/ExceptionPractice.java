package com.rakovets.course.javabasics.practice.exceptionhandling;

public class  ExceptionPractice {
    public String str;
    public String[] strArr = new String[3];
    public Integer checkStr () {
        try {
            return str.length();
        } catch (Exception e) {
            return -1;
        }
    }

    public String checkArr () {
        try {
            return strArr[4];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Not Exists";
        }
    }


}
