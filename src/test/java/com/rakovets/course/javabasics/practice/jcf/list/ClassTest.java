package com.rakovets.course.javabasics.practice.jcf.list;

import classStud.SchoolClass;
import classStud.StudentAgeComparator;
import classStud.StudentFullNameCompare;
import classStud.Students;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class ClassTest {
    LinkedList<Students> students = new LinkedList<>();

    @Test
    void classTest () {
        students.add(new Students("Tom","Mitchell",6.4,16));
        students.add(new Students("Jack","Olivera",6.8,15));
        students.add(new Students("Kristina","Mitchell",7.8,16));
        students.add(new Students("Tom","Radman",4.5,17));
        students.add(new Students("Victoria","Nogeira",8.5,16));
        students.add(new Students("Andry","Nalivkin",8.9,15));
        SchoolClass schoolClass = new SchoolClass(students);
        LinkedList<Students> students1 = new LinkedList<Students>(schoolClass.students);
        schoolClass.getBestStudent(students);
        Assertions.assertEquals(students1.getLast().getAverageAnnualMark(),students.getLast().getAverageAnnualMark());
        students.sort(new StudentAgeComparator());
        students1.sort(new StudentAgeComparator());
        Assertions.assertEquals(students1.getLast().getAge(),students.getLast().getAge());
        students.sort(new StudentFullNameCompare());
        students1.sort(new StudentFullNameCompare());
        Assertions.assertEquals(students1.getFirst().getSurName(),students.getFirst().getSurName());
        Assertions.assertEquals(students1.getLast().getSurName(),students.getLast().getSurName());


    }

}
