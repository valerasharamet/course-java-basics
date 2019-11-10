package com.rakovets.course.challenge.oop.polymorphism;

public class Archer extends Hero {
    private final int DEFAULT_DAMAGE = 20;
    private final int DEFAULT_HEALTH = 300;

    {
        setHealth(DEFAULT_HEALTH);
    }

    Archer(String name) {
        super(name);
    }

    @Override
    void attackEnemy() {
        System.out.println("Archer shots to Enemy");
    }

    void attackEnemy(Enemy enemy) {
        attackEnemy();
        enemy.takeDamage(DEFAULT_DAMAGE);
    }
}
