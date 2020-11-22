package com.rakovets.course.javabasics.practice.concurrency.master_worker;

import java.util.LinkedList;

public class ThredWorker extends Thread {
    public LinkedList<Integer> listInt;
    public boolean isRun = true;
    ThredMaster thredMaster;

    public ThredWorker(LinkedList<Integer> listInt, ThredMaster thredMaster) {
        this.listInt = listInt;
        this.thredMaster = thredMaster;

    }



    public void run() {
        while (isRun && thredMaster.isRun == true) {
            if (listInt.size() > 0  ) {
                for (Integer x : listInt) {
                    try {
                        System.out.printf("I slept %d seconds\n", x);
                        Thread.sleep(x * 1000);
                        listInt.remove(x);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            } else {
                System.out.println(". . .");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}







