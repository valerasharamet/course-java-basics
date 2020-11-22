package com.rakovets.course.javabasics.practice.concurrency;

import com.rakovets.course.javabasics.practice.concurrency.master_worker.ThredMaster;
import com.rakovets.course.javabasics.practice.concurrency.master_worker.ThredWorker;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MasterWorkerTest {
    public static void main(String[] args) throws InputMismatchException {
        LinkedList<Integer> list = new LinkedList<>();

        ThredWorker thredWorker = new ThredWorker(list);
        ThredMaster thredMaster = new ThredMaster(list);
        Scanner scanner = new Scanner(System.in);
        List<Integer> listInt = new LinkedList<>();

        int start = -1;
        System.out.println("Welcom to MasterWorkerTest, if you want start program enter '1'");
        start = scanner.nextInt();
        if (start == 1) {
            thredMaster.run();



        }
    }

}
