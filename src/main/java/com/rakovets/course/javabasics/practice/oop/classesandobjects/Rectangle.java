package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Rectangle {
    Point firstPoint;
    Point secondPoint;
    public Rectangle (Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }
    public Point getFirstPoint() {
        return this.firstPoint;
    }
    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }
    public Point getSecondPoint() {
        return this.secondPoint;
    }
    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }
    public int getPerimeter () {
        int per= 0;
        return per;
    }
    public int getArea() {
        int area= 0;
        return area;
    }
}
