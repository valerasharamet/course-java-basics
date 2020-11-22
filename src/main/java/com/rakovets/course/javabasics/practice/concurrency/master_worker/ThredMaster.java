package com.rakovets.course.javabasics.practice.concurrency.master_worker;

import java.util.LinkedList;
import java.util.Scanner;

public class ThredMaster implements Runnable {
    LinkedList<Integer> listInt;
    public ThredMaster (LinkedList<Integer> listInt) {
        this.listInt = listInt;
    }
    public boolean isRun = true;
    public int number = 0;
    Scanner scanner = new Scanner(System.in);


    @Override
    public void run() {
        while (isRun) {
            System.out.println("Enter number");
            System.out.println("If you want stop program enter '-1'");
            number = scanner.nextInt();
            if(number != -1) {
                listInt.add(number);
                System.out.println(listInt);
            } else {
                isRun = false;
            }
        }
    }

}
