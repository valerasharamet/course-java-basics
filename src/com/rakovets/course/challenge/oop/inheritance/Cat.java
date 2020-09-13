package com.rakovets.course.challenge.oop.inheritance;

public class Cat {
    private String name;

    Cat(String name) {
        this.name = name;
    }

    void mew() {
        System.out.println("mew-mew-mew");
    }

    void mew(Person person) {
        System.out.println("mew-mew-mew to Person");
        person.takeHappiness(-5);
    }

    void purr() {
        System.out.println("purr-purr-purr");
    }

    void purr(Person person) {
        System.out.println("purr-purr-purr to Person");
        person.takeHappiness(5);
    }

    void display() {
        System.out.printf("Cat {name: %s}\n", this.name);
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }
}
