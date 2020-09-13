package com.rakovets.course.practice.solid.o;

public class GeometryHelper {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        calculateArea(circle);
    }

    public static double calculateArea(Shape shape) {
        double result = 0;
        if (shape instanceof Circle) {
            Circle anyCircle = (Circle) shape;
            result = 2 * Math.PI * anyCircle.radius;
        } else if (shape instanceof Rectangle) {
            Rectangle anyRectangle = (Rectangle) shape;
            result = anyRectangle.height * anyRectangle.width;
        } else if (shape instanceof Triangle) {
            Triangle anyTriangle = (Triangle) shape;
            result = 0.5 * anyTriangle.height * anyTriangle.base;
        }
        return result;
    }
}
