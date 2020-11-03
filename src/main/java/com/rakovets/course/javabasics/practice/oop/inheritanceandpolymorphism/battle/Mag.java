package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Mag extends Hero {
    int mana;
    public Mag (String name, int health, int damage, int mana) {
        super(name, health, damage);
        this.mana = mana;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("The Mag attacks the enemy!!!");
        enemy.takeDamage(this.damage, this);
    }

     public void magUltimate () {
        if(this.health <=50 && mana >100 ) {
            this.health = 500;
            this.damage = 300;
            this.mana = this.mana - 100;
        }
     }
}
