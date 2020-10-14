package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class PointTest {
    public static void main (String[] args) {
        Point point1 = new Point(2, 3);
        System.out.println(point1.getX() + "\t" + point1.getY());
        point1.setX(6);
        point1.setY(12);
        System.out.println(point1.getX() + "\t" + point1.getY());
        Point point2 = new Point(10, 15);
        System.out.println(point1.distance(point2));
    }
}
