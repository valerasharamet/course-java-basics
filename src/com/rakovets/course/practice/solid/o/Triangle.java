package com.rakovets.course.practice.solid.o;

public class Triangle extends Shape {
    double height;
    double base;

    @Override
    double calculateArea() {
        return 0.5 * this.height * this.base;
    }
}
