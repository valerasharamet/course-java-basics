package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Enemy implements Mortal{
    protected int health;
    protected int damage;

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage, Hero hero) {
        health = health - damage;
        hero.takeDamage(this.damage);
    }

    @Override
    public boolean isAlive() {
        return (health > 0);
    }

}
