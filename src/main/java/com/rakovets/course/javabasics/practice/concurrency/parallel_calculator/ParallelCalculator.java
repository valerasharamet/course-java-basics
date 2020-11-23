package com.rakovets.course.javabasics.practice.concurrency.parallel_calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelCalculator {
    public List<int[]> fillArrays(int sz) {
        List<int[]> intList = new ArrayList<>();
        for (int i = 0; i < sz; i++) {
            int[] intArr = new int[new Random().nextInt(100) + 10];
            for (int j = 0; j < intArr.length; j++) {
                intArr[j] = new Random().nextInt(300);

            }
            intList.add(intArr);
        }
        for (int[] x : intList) {
            int maxElement = x[1];
            for (int k : x) {
                for (int i = 0; i < x.length; i++) {
                    if (maxElement >= k) {
                        maxElement = k;
                    }
                }

            }
            System.out.println("Max Element of Array" + " = " + maxElement);
        }
        return intList;
    }

    public List<int[]> fillArrayAndMaxElement(int thread, int sz) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i <= thread; i++) {
            Thread thread1 = new Thread(new CalculatorThred(list, thread));
            thread1.start();
        }
        return list;

    }


}
