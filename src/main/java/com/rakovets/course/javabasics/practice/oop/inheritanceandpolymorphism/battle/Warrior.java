package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Warrior extends Hero {
    public Warrior(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("The Warrior attacks the enemy!!!");
        enemy.takeDamage(this.damage, this);
        if (this.health <= 200) {
            this.health = this.health + 50;
        }
    }
}
