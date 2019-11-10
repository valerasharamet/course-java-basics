package com.rakovets.course.challenge.oop.polymorphism;

public class Warrior extends Hero {
    private final int DEFAULT_DAMAGE = 12;
    private final int DEFAULT_HEALTH = 400;

    {
        setHealth(DEFAULT_HEALTH);
    }

    Warrior(String name) {
        super(name);
    }

    @Override
    void attackEnemy() {
        System.out.println("Warrior bits to Enemy");
    }

    void attackEnemy(Enemy enemy) {
        attackEnemy();
        enemy.takeDamage(DEFAULT_DAMAGE);
    }
}
