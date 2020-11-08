package com.rakovets.course.javabasics.practice.jcf.list;
import Studio.*;
import Studio.Actor;
import Studio.Studio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

public class StudioTest  {
    LinkedList<Actor> actors = new LinkedList<Actor>();

    @Test
    void studiooTest () {
        actors.add(new Actor("Jonh", "Wall",100,29));
        actors.add(new Actor("Steph", "Curry",98,31));
        actors.add(new Actor("Kayle", "Korver",50,54));
        actors.add(new Actor("Lebron","James",139.5,35));
        actors.add(new Actor("Klay","Thomson",93.5,29));
        actors.add(new Actor("Antony","Davis",93.5,31));
        actors.add(new Actor("Antony","Carmelo",87,38));
        Studio studio = new Studio(actors);
        LinkedList<Actor> actors2 = new LinkedList<Actor>(studio.fire(actors));
        Assertions.assertEquals(actors2.getFirst().getFirstName(),actors.getFirst().getFirstName());
        Assertions.assertEquals(actors2.getLast().getFee(),actors.getLast().getFee());
        actors.sort(new ActorAgeComparator());
        actors2.sort(new ActorAgeComparator());
        Assertions.assertEquals(actors2.getFirst().getAge(),actors.getFirst().getAge());
    }
}
