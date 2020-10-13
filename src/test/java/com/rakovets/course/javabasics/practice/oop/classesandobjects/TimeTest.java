package com.rakovets.course.javabasics.practice.oop.classesandobjects;
import java.util.Scanner;
public class TimeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();

        int h =  (args.length != 3 ? scanner.nextInt() : Integer.parseInt(args[2]));
    }
}
