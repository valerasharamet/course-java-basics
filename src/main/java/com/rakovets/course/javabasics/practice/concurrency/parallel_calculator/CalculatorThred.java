package com.rakovets.course.javabasics.practice.concurrency.parallel_calculator;

import java.util.List;
import java.util.Random;

public class CalculatorThred implements Runnable {
    List<int[]> list;
    int thread;
    public CalculatorThred(List<int[]> list, int thread) {
        this.list = list;
        this.thread = thread;
    }

    @Override
    public void run() {
        int[] intArr = new int[new Random().nextInt(10)+1];
        for(int x: intArr) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x = (int) (Math.random() * 300);

        }
        list.add(intArr);
        int maxElem = intArr[0];
        for(int x:intArr ) {
            if(maxElem>=x) {
                maxElem = x;
            }
        }
        System.out.println("MaxElement = " + maxElem);
    }
}
