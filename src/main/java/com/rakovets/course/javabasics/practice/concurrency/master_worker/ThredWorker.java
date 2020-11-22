package com.rakovets.course.javabasics.practice.concurrency.master_worker;

import java.util.LinkedList;

public class ThredWorker implements Runnable {
    public LinkedList<Integer> listInt;

    public ThredWorker (LinkedList<Integer> listInt) {
        this.listInt = listInt;
    }


    @Override
    public void run () {
        System.out.println(". . .");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }




}
