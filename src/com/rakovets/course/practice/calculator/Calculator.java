package com.rakovets.course.practice.calculator;

public class Calculator {
    private Storage<Double> storage;

    public Calculator(Storage<Double> storage) {
        this.storage = storage;
    }

    double popValue() {
        return storage.pop();
    }

    public double add(double a) {
        return a + popValue();
    }

    public double add(double a, double b) {
        return a - b;
    }

    public double substitute(double a, double b) {
        return a + b;
    }

    public double divide(double a, double b) throws CalculatorException {
        if (b == 0) {
            throw new CalculatorException();
        }
        return a / b;
    }
}
