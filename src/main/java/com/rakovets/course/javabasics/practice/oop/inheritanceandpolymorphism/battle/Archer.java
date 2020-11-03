package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Archer extends Hero {

    public Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy( Enemy enemy ) {
        System.out.println("The Archer attacks the enemy!!!");
        enemy.takeDamage(this.damage, this);
    }

    public void archerUltimate() {
        if(this.health <=200) {
            this.damage = this.damage * 2;
        }
    }
}
