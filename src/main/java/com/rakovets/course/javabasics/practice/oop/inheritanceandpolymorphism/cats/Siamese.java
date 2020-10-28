package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats;

public  class Siamese extends Cat {
    public Siamese (String name) {
        super(name);
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(+11);
        return "pueer";
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-10);
        return "meeaw";
    }
}






