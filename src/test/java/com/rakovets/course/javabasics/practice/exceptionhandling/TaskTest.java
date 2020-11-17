package com.rakovets.course.javabasics.practice.exceptionhandling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void Test () {
        ExceptionPractice exceptionPractice = new ExceptionPractice();
        Assertions.assertEquals(-1,exceptionPractice.checkStr());
        Assertions.assertEquals("Not Exists",exceptionPractice.checkArr());
    }
}
