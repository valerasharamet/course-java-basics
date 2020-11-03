package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public class Mag extends Hero {
    int mana;
    public Mag (String name, int health, int damage, int mana) {
        super(name, health, damage);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("The Mag attacks the enemy!!!");
        enemy.takeDamage(this.damage, this);
    }

     public void magUltimate () {
        if(this.isAlive()== false && this.mana >= 100 ) {
            this.health = 500;
            this.damage = 300;
            this.mana = this.mana - 100;
        }
     }
}
