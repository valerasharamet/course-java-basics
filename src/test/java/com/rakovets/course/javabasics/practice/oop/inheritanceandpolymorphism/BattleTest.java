package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle.Archer;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle.Enemy;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle.Zombie;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battle.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BattleTest {
    Archer archer = new Archer("Chris", 250,100);
    Enemy enemy = new Enemy(500,50);

    @Test
    void archerTest () {
        archer.attackEnemy(enemy);
        Assertions.assertEquals(200,archer.getHealth());
        Assertions.assertEquals(100,archer.getDamage());
        archer.archerUltimate();
        Assertions.assertEquals(200,archer.getDamage());
    }

    @Test
    void zombieTest() {
        Zombie zombie = new Zombie(300, 50, 2);
        Assertions.assertEquals(300, zombie.getHealth());
        Assertions.assertEquals(2, zombie.getLifeCount());
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        Assertions.assertEquals(100, zombie.getHealth());
        archer.attackEnemy(zombie);
        Assertions.assertEquals(false, zombie.isAlive());
        zombie.zombieUltimate();
        Assertions.assertEquals(1, zombie.getLifeCount());
        Assertions.assertEquals(200,zombie.getHealth());
    }

    @Test
    void MagTest () {
        Mag mag = new Mag("Kupidon", 200, 100,200);
        mag.attackEnemy(enemy);
        Assertions.assertEquals(150, mag.getHealth());
        mag.attackEnemy(enemy);
        mag.attackEnemy(enemy);
        mag.magUltimate();
        Assertions.assertEquals(500, mag.getHealth());
        Assertions.assertEquals(300, mag.getDamage());
    }

    @Test
    void warriorTestpaladinTest() {
        Warrior warrior = new Warrior("Garosh", 400,100);
        Paladin paladin = new Paladin(300,100,100);
        warrior.attackEnemy(paladin);
        Assertions.assertEquals(200,paladin.getHealth());
        Assertions.assertEquals(300,warrior.getHealth());
        warrior.attackEnemy(paladin);
        Assertions.assertEquals(250,warrior.getHealth());//WarriorUltimate
        paladin.paladinUltimate();
        Assertions.assertEquals(200,paladin.getHealth());
        Assertions.assertEquals(50,paladin.getMana());
    }

    @Test
    void trolTest() {
        Trol trol = new Trol(1000,30,4);
        Assertions.assertEquals(4,trol.ultimateTrol());
        Assertions.assertEquals(0,trol.getCloningAttempts());
    }
}
