package com.rakovets.course.practice.solid.o;

public class Circle extends Shape {
    double radius;

    @Override
    double calculateArea() {
        return 2 * Math.PI * this.radius;
    }
}
