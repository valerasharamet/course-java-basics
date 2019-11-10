package com.rakovets.course.challenge.oop.inheritance;

public class Persian extends Cat {
    Persian(String name) {
        super(name);
    }

    @Override
    void mew() {
        System.out.println("mewp-mewp-mewp");
    }

    @Override
    void mew(Person person) {
        System.out.println("mewp-mewp-mewp to Person");
        person.takeHappiness(-7);
    }

    @Override
    void purr() {
        System.out.println("purrp-purrp-purrp");
    }

    @Override
    void purr(Person person) {
        System.out.println("purrs-purrs-purrs to Person");
        person.takeHappiness(7);
    }
}
