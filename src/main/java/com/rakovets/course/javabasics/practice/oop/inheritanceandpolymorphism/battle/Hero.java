package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle;

public abstract class Hero implements Mortal {
    private String name;
    protected int health;
    protected int damage;
    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth () {
            return health;
    }

    public int getDamage() {
        return damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive() {
        return (health > 0);
    }

    public void takeDamage(int damage) {
         this.health = this.health - damage;
    }
}
