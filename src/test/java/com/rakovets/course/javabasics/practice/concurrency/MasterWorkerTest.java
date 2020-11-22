package com.rakovets.course.javabasics.practice.concurrency;

import com.rakovets.course.javabasics.practice.concurrency.master_worker.ThredMaster;
import com.rakovets.course.javabasics.practice.concurrency.master_worker.ThredWorker;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

public class MasterWorkerTest {
    public static void main(String[] args) throws InputMismatchException {
        LinkedList<Integer> list = new LinkedList<>();
        ThredMaster thredMaster = new ThredMaster(list);
        Thread threadWorker = new ThredWorker(list,thredMaster);
        Thread threadMaster = new Thread(thredMaster);
        List<Integer> listInt = new LinkedList<>();
        threadWorker.start();
        threadMaster.start();
    }


}
