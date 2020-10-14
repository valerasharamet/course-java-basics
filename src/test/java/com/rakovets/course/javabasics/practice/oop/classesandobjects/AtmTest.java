package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class AtmTest {
    public static void main (String[] args) {
        Atm atm = new Atm(4,0,0);
        if(!atm.isPossibleIssue(320))
            System.out.println("There are not enough cash in the ATM");

    }
}
