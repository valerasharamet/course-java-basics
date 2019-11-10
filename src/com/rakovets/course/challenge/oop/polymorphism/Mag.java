package com.rakovets.course.challenge.oop.polymorphism;

public class Mag extends Hero {
    private final int DEFAULT_DAMAGE = 7;
    private final int DEFAULT_HEALTH = 200;

    {
        setHealth(DEFAULT_HEALTH);
    }

    Mag(String name) {
        super(name);
    }

    @Override
    void attackEnemy() {
        System.out.println("Mag saying magic-words to Enemy");
    }

    void attackEnemy(Enemy enemy) {
        attackEnemy();
        enemy.takeDamage(DEFAULT_DAMAGE);
    }
}
