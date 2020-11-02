package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public abstract class Hero {
    private String name;
    protected int health = 100;
    public Hero(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void attackEnemy(Enemy enemy);
}
