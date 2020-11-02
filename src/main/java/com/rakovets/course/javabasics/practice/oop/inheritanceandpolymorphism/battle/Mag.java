package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Mag extends Hero {
    public Mag(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("The Mag attacks the enemy!!!");
        enemy.takeDamage(15);
    }
}
