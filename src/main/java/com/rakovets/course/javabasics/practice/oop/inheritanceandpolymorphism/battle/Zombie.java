package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Zombie extends Enemy {
    private int lifeCount;

    public Zombie(int health, int damage, int lifeCount) {
        super(health, damage);
        this.lifeCount = lifeCount;
    }

    public int getLifeCount() {
        return lifeCount;
    }

    public void zombieUltimate() {
        if( lifeCount > 0 && this.isAlive() == false) {
            this.health = 50;
            lifeCount--;
        }
    }
}
