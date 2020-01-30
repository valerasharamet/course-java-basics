package com.rakovets.course.practice.solid.i;

public class Dog extends Animal implements Moveable, Swimmable, Eatable, Sleepable {
    @Override
    public void move() {
        System.out.println("тыц-тыц-тыц-тыц");
    }

    @Override
    public void eat() {
        System.out.println("om-nom-nom");
    }

    @Override
    public void swimm() {
        System.out.println("По собачьи: плюх, вжух-вхуж");
    }


    @Override
    public void sleep() {
        System.out.println("Hhhhrrrrrrrrrrrrrrrrrrrrrr");
    }
}
