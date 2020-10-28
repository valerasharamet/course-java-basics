package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats;

public class Persian extends Cat {
    public Persian (String name) {
        super(name);
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(+16);
        return "puarr";
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-15);
        return "meaw";
    }
}

