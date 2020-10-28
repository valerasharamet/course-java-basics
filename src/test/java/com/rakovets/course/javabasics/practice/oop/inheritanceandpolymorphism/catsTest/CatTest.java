package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.catsTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.*;

public class CatTest {
    Person person = new Person(100);

    @Test
        //Cat
    void catTest() {
        Cat cat = new Cat("Vasa");
        Assertions.assertEquals("Vasa", cat.getName());
        Assertions.assertEquals(100, person.getHappiness());
        Assertions.assertEquals("mew", cat.mew(person));
        Assertions.assertEquals(99, person.getHappiness());
        Assertions.assertEquals("purr", cat.purr(person));
        Assertions.assertEquals(100, person.getHappiness());
    }

    @Test //Persian

    void persianTest() {
        Persian pers = new Persian("Pers");
        Assertions.assertEquals("Pers",pers.getName());
        Assertions.assertEquals(100, person.getHappiness());
        Assertions.assertEquals("meaw", pers.mew(person));
        Assertions.assertEquals(85, person.getHappiness());
        Assertions.assertEquals("puarr", pers.purr(person));
        Assertions.assertEquals(101, person.getHappiness());
    }

    @Test
    //Siamese
    void siameseTest() {
        Siamese siam = new Siamese("Siam");
        Assertions.assertEquals("Siam",siam.getName());
        Assertions.assertEquals(100, person.getHappiness());
        Assertions.assertEquals("meeaw", siam.mew(person));
        Assertions.assertEquals(90, person.getHappiness());
        Assertions.assertEquals("pueer", siam.purr(person));
        Assertions.assertEquals(101, person.getHappiness());
    }

    @Test
    //Sphynx
    void sphynxTest() {
        Sphynx sphynx = new Sphynx("Samson");
        Assertions.assertEquals("Samson",sphynx.getName());
        Assertions.assertEquals(100, person.getHappiness());
        Assertions.assertEquals("maauew", sphynx.mew(person));
        Assertions.assertEquals(80, person.getHappiness());
        Assertions.assertEquals("pouur", sphynx.purr(person));
        Assertions.assertEquals(101, person.getHappiness());
    }
}
