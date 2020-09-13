package com.rakovets.course.practice.calculator;

public class StorageStub implements Storage {
    @Override
    public boolean save(Object object) {
        return false;
    }

    @Override
    public Double pop() {
        return Double.valueOf(0);
    }
}
