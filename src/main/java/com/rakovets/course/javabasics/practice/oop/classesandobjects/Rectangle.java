package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Rectangle {
    Point firstPoint;
    Point secondPoint;
    public Rectangle (Point firstPoint, Point secondPoint) {
        this.firstPoint = new Point(firstPoint.getX(), firstPoint.getY());
        this.secondPoint = new Point(secondPoint.getX(), secondPoint.getY());
        if ((firstPoint.getX() == secondPoint.getX() && firstPoint.getY() == secondPoint.getY())
                || (firstPoint.getX() == secondPoint.getX() || firstPoint.getY() == secondPoint.getY())) {
            System.out.println("Attention: rectangle cannot be created ");
        }
    }
    public Point getFirstPoint() {
        return firstPoint;
    }
    public void setFirstPoint(Point firstPoint) {
        this.firstPoint.setPoint(firstPoint);
    }
    public Point getSecondPoint() {
        return secondPoint;
    }
    public void setSecondPoint(Point secondPoint) {
        this.secondPoint.setPoint(secondPoint);
    }
    public double getPerimeter () {
        Point thirdPoint = new Point(secondPoint.getX(), firstPoint.getY());
        double distFistPointToThirdPoint = firstPoint.distance(thirdPoint);
        double distSecondPointToThirdPoint = secondPoint.distance(thirdPoint);
        return distFistPointToThirdPoint* 2 + distSecondPointToThirdPoint * 2;
    }
    public double getArea() {
        Point thirdPoint = new Point(secondPoint.getX(), firstPoint.getY());
        double distFistPointToThirdPoint = firstPoint.distance(thirdPoint);
        double distSecondPointToThirdPoint = secondPoint.distance(thirdPoint);
        return distFistPointToThirdPoint * distSecondPointToThirdPoint;
    }
}
