package com.rakovets.course.challenge.oop.inheritance;

public class Siamese extends Cat {
    Siamese(String name) {
        super(name);
    }

    @Override
    void mew() {
        System.out.println("mews-mews-mews");
    }

    @Override
    void mew(Person person) {
        System.out.println("mews-mews-mews to Person");
        person.takeHappiness(-10);
    }

    @Override
    void purr() {
        System.out.println("purrs-purrs-purrs");
    }

    @Override
    void purr(Person person) {
        System.out.println("purrs-purrs-purrs to Person");
        person.takeHappiness(10);
    }
}
