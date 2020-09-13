package com.rakovets.course.challenge.oop.polymorphism;

public abstract class Hero implements Mortal {
    private final int DEFAULT_DAMAGE = 10;

    private String name;
    private int health;

    Hero(String name) {
        this.name = name;
    }

    void takeDamage(int damage) {
        if (isAlive()) {
            this.health -= damage;
        } else {
           System.out.println(this.name + "is dead");
        }
    }

    abstract void attackEnemy();

    abstract void attackEnemy(Enemy enemy);

    String getName() {
        return this.name;
    }

    void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    @Override
    public String toString() {
        return String.format("Hero {\"name\":\"%s\", \"health\":\"%d\"}", this.name, this.health);
    }
}
