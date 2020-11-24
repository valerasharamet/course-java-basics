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
        for(int x : intArr) {
            x = new Random().nextInt(300);

        }
        int maxElem = intArr[0];
        for(int x:intArr ) {
            if(maxElem>=x) {
                maxElem = x;
            }
        }
        list.add(intArr);
        System.out.println("MaxElement = " + maxElem);
    }
}
