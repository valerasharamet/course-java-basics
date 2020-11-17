package com.rakovets.course.javabasics.practice.exceptionhandling;

import java.util.Random;

public class Task6 {
    public void RandomException() throws ArrayIndexOutOfBoundsException, ArithmeticException, ArrayStoreException {
        int num = new Random().nextInt(2);
        switch (num) {
            case 0:
                throw new ArrayIndexOutOfBoundsException();
            case 1:
                throw new ArithmeticException("ArithmeticError");
            case 2:
                throw new ArrayStoreException();
        }
    }

    public static void main(String[] args) {
        Task6 obj = new Task6();
        try {
            obj.RandomException();
        } catch (ArrayIndexOutOfBoundsException | ArrayStoreException exception) {
            System.out.println("Error in arrays");
        } catch (ArithmeticException exception) {
           System.out.println(exception.getMessage());
        }
    }
}
