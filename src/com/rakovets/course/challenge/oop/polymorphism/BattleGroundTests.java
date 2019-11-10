package com.rakovets.course.challenge.oop.polymorphism;

public class BattleGroundTests {
    public static void main(String[] args) {
//        Hero jon = new Hero("Jon");
//        System.out.println(jon.toString());
//        System.out.println("Hero name is " + jon.getName());
//        jon.attackEnemy();

        Hero legalaise = new Archer("Legalaise");
        System.out.println(legalaise.toString());
        legalaise.attackEnemy();
        Hero necro = new Mag("Necro");
        System.out.println(necro.toString());
        necro.attackEnemy();
        Hero dunkan = new Warrior("Dunkan");
        System.out.println(dunkan.toString());
        dunkan.attackEnemy();

        Enemy zombie = new Enemy(200);
        System.out.println(zombie.toString());
//        jon.attackEnemy(zombie);
        System.out.println(zombie.toString());
        dunkan.attackEnemy(zombie);
        zombie.attackHero(dunkan);
        System.out.println(dunkan.toString());
        System.out.println(zombie.toString());
        legalaise.attackEnemy(zombie);
        zombie.attackHero(legalaise);
        System.out.println(legalaise.toString());
        System.out.println(zombie.toString());
        necro.attackEnemy(zombie);
        zombie.attackHero(necro);
        System.out.println(necro.toString());
        System.out.println(zombie.toString());
        while (zombie.isAlive()) {
            legalaise.attackEnemy(zombie);
        }
        System.out.println(zombie.toString());
    }
}