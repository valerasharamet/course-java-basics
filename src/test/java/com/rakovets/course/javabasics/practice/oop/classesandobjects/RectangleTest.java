package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class RectangleTest {
    public static void main(String[] args) {
        Point firstPoint = new Point(0, 0);
        Point secondPont = new Point(2, 4);
        Rectangle rect = new Rectangle(firstPoint, secondPont);
        System.out.println("firstPoint(X,Y):("+rect.getFirstPoint().getX()+","+rect.getFirstPoint().getY() +
                ")\tsecondPoint(X,Y): ("+rect.getSecondPoint().getX()+","+rect.getSecondPoint().getY()+")");
        System.out.println("Perimeter: " + rect.getPerimeter() + "\tArea: "  + rect.getArea());
        rect.firstPoint.setX(5);
        rect.secondPoint.setX(7);
        rect.firstPoint.setY(8);
        rect.secondPoint.setY(11);
        System.out.println("firstPoint(X,Y): ("+rect.getFirstPoint().getX()+","+rect.getFirstPoint().getY() +
                ")\tsecondPoint(X,Y):("+rect.getSecondPoint().getX()+","+rect.getSecondPoint().getY()+")");
        System.out.println("Perimeter: " + rect.getPerimeter() + "\tArea: "  + rect.getArea());

    }
}
