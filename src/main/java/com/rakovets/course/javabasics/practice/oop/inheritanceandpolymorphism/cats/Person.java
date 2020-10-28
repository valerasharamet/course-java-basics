package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats;

public class Person {
    public double happiness;

    public Person (double happiness) {
        this.happiness = happiness;
    }

    public double changeHappiness(double percentHappiness) {
        return this.happiness = this.happiness + percentHappiness;
    }

    public double getHappiness() {
        return this.happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

}
