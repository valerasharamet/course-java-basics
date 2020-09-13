package com.rakovets.course.practice.calculator;

public interface Storage<T> {
    boolean save(T object);
    T pop();
}
