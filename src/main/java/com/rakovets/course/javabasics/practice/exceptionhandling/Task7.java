package com.rakovets.course.javabasics.practice.exceptionhandling;

import java.util.Random;

public class Task7 {
    public void ArrayIndexRandom (String[] strArr) throws ArrayIndexOutOfBoundsException {
        int index = new Random().nextInt(2);
        strArr[index] = "Wow";
    }

    public static void main(String[] args) {
        Task7 obj = new Task7();
        String[] strArr = new String[1];
        try {
            obj.ArrayIndexRandom(strArr);
            System.out.println(strArr[0]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Task7 result: " + strArr[0]);
        }
    }
}
