package com.rakovets.course.practice.solid.o;

public class TrueMultipleangle extends Shape {
    double base;
    double height;
    double countAngle;

    @Override
    double calculateArea() {
        return this.countAngle * 0.5 * base * height;
    }
}
