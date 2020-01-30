package com.rakovets.course.practice.solid.i;

public class Eagle extends Animal implements Eatable, Flyable, Sleepable {
    @Override
    public void eat() {
        System.out.println();
    }

    @Override
    public void fly() {
        System.out.println();
    }

    @Override
    public void sleep() {
        System.out.println("Hrrrrrrrrrrrrr");
    }
}
