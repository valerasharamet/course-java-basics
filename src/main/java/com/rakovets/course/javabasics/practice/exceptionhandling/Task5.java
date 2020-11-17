package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task5 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        try {
            try {
                numbers[2] = Integer.parseInt("seven");
            } catch (NumberFormatException e) {
                throw new MyNumFormExcepcion(e.getMessage());
            }
        } catch (MyNumFormExcepcion excepcion) {
            excepcion.printStackTrace();
            excepcion.getMessage();
        }
    }
}