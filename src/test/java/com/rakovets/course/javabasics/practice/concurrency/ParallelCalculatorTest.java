package com.rakovets.course.javabasics.practice.concurrency;

import com.rakovets.course.javabasics.practice.concurrency.parallel_calculator.ParallelCalculator;

import java.util.ArrayList;
import java.util.List;

public class ParallelCalculatorTest {
    public static void main(String[]args) {
        List<int[]> list = new ArrayList<>();
        ParallelCalculator calculator = new ParallelCalculator();
        list = calculator.fillArrayAndMaxElement(10,10);


    }
}
