package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy( Enemy enemy ) {
        System.out.println("The Archer attacks the enemy!!!");
        enemy.takeDamage(20);
    }
}
