package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Point {
    private int x;
    private int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y= y;
    }
    public double distance(Point pt) {
        return Math.sqrt(Math.pow((x- pt.x),2)+Math.pow((y- pt.y),2));
    }

}
