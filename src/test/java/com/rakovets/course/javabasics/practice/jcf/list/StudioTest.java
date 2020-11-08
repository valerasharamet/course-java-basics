package com.rakovets.course.javabasics.practice.jcf.list;

import Studio.Actor;
import Studio.Studio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class StudioTest  {
    LinkedList<Actor> actors = new LinkedList<>();
    LinkedList<Actor> actors1 = new LinkedList<>();

    @Test
    void studiooTest () {

        actors.add(new Actor("Jonh", "Wall",100,29));
        actors.add(new Actor("Steph", "Curry",98,31));
        actors.add(new Actor("Kayle", "Korver",50,54));
        Studio studio = new Studio(actors);
        actors1.add(new Actor("Kayle", "Korver",50,54));
        actors1.add(new Actor("Steph", "Curry",98,31));
        Assertions.assertEquals(actors1,studio.fire(actors));




    }



}
