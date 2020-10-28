package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats;
public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String mew(Person person) {
        person.changeHappiness(-1);
        return "mew";
    }

    public String purr (Person person) {
        person.changeHappiness(+1);
        return "purr";
    }

}
