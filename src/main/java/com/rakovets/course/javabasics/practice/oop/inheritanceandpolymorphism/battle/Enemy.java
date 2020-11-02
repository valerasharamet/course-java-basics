package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Enemy implements Mortal{
    protected int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        health = health - damage;
        if (health < 0) health = 0;
    }
    @Override
    public boolean isAlive() {
        return (health > 0);
    }
}
