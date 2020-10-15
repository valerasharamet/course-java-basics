package com.rakovets.course.javabasics.practice.oop.classesandobjects;
import java.util.Scanner;
public class AtmTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Atm atm = new Atm(10, 30, 20);
        if (!atm.isPossibleIssue(300))
            System.out.println("There are not enough cash in the ATM");
        else {
            System.out.println("Check option");
            atm.getOptionsCombinationBanknotes(300);
            int opt = scanner.nextInt();
            System.out.println("Take your money " + atm.getCash(opt) + " banknotes");
        }
    }
}
