package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Trol extends Enemy {
    int cloningAttempts;
    public Trol(int health, int damage, int cloningAttempts) {
        super(health, damage);
        this.cloningAttempts = cloningAttempts;
    }

    public int getCloningAttempts () {
        return cloningAttempts;
    }

    public int ultimateTrol () {
        int successfulcloningAttempts=0;
        while (this.health > 500 && cloningAttempts >0) {
            new Trol(200,20,0);
            this.health = this.health - 100;
            cloningAttempts--;
            successfulcloningAttempts++;
        }
        return successfulcloningAttempts;
    }
}
