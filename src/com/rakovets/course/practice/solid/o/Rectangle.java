package com.rakovets.course.practice.solid.o;

public class Rectangle extends Shape {
    double width;
    double height;

    @Override
    double calculateArea() {
        return this.height * this.width;
    }
}
