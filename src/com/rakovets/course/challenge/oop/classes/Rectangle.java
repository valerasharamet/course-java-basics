package com.rakovets.course.challenge.oop.classes;

public class Rectangle {
    private Point pointLT;
    private Point pointRU;

    Rectangle(Point pointLT, Point pointRU) {
        this.pointLT = pointLT;
        this.pointRU = pointRU;
    }

    double area() {
        return Math.abs(this.pointRU.getX() - this.pointLT.getX())
                * Math.abs(this.pointLT.getY() - this.pointRU.getY());
    }

    double perimeter() {
        return 2 * (Math.abs(this.pointRU.getX() - this.pointLT.getX())
                + Math.abs(this.pointLT.getY() - this.pointRU.getY()));
    }

    void display() {
        System.out.printf("Rectangle:\n");
        this.pointLT.display();
        this.pointRU.display();
    }

    Point getPointLT() {
        return this.pointLT;
    }

    void setPointLT(Point point) {
        this.pointLT = point;
    }

    Point getPointRU() {
        return this.pointRU;
    }

    void setPointRU(Point point) {
        this.pointRU = point;
    }

}
