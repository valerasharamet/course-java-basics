package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("The Warrior attacks the enemy!!!");
        enemy.takeDamage(10);
    }
}
