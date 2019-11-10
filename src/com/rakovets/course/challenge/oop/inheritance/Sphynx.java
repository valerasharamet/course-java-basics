package com.rakovets.course.challenge.oop.inheritance;

public class Sphynx extends Cat {
    Sphynx(String name) {
        super(name);
    }

    @Override
    void mew() {
        System.out.println("me-me-me");
    }

    void mew(Person person) {
        System.out.println("me-me-me to Person");
        person.takeHappiness(-2);
    }

    @Override
    void purr() {
        System.out.println("pur-pur-pur");
    }

    @Override
    void purr(Person person) {
        System.out.println("pur-pur-pur to Person");
        person.takeHappiness(2);
    }
}
