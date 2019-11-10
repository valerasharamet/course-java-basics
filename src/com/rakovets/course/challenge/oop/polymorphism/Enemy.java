package com.rakovets.course.challenge.oop.polymorphism;

public class Enemy implements Mortal{
    private static final int DEFAUL_DAMAGE = 15;
    private int health;

    Enemy(int health) {
        this.health = health;
    }

    void takeDamage(int damage) {
        this.health -= damage;
    }

    void attackHero(Hero hero) {
        System.out.println("Enemy attack " + hero.getName());
        hero.takeDamage(DEFAUL_DAMAGE);
    }

    int getHealth() {
        return this.health;
    }

    void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Enemy {\"health\":\"" + this.health + "\"}";
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}
