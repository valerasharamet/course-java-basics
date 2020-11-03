package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Paladin extends Enemy {
    int mana;
    public Paladin(int health, int damage, int mana) {
        super(health, damage);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void paladinUltimate() {
        if (mana > 50 && this.health <= 100) {
            this.health = this.health + 100;
            mana = mana - 50;
        }
    }
}
