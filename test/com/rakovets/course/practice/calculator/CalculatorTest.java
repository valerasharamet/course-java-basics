package com.rakovets.course.practice.calculator;

import org.junit.jupiter.api.*;

import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Custom test name containing spaces")
public class CalculatorTest {
    private static Calculator calculator;
    private static HashMap<Object, Object> resultTest;

    @BeforeAll
    static void init() {
        calculator = new Calculator(new StorageStub());
        resultTest = new HashMap<>();
        System.out.println("INIT!");
    }

    @BeforeEach
    void clear() {
        resultTest = new HashMap<>();
        System.out.println("CLEAR!");
    }

    @AfterAll
    static void destroy() {
        calculator = null;
        resultTest = new HashMap<>();
        System.out.println("Destroy!");
    }

    @AfterEach
    void getResult() {
        resultTest = new HashMap<>();
        System.out.println("Get Result!");
    }


    @Test
    @DisplayName("Tests for calculator: add()")
    void testSubstitute() {
        assertEquals(10, calculator.substitute(20, 10));
        assertEquals(110, calculator.substitute(120, calculator.substitute(20, 10)));
    }

    @Test
    @DisplayName("Calculator Tests")
    void testAdd() {
        assertEquals(7, calculator.add(2, 5));
        assertEquals(105, calculator.add(100, 5));
        assertEquals(205, calculator.add(5, 200));
        assertEquals(246, calculator.add(123, 123));
    }

    @Test
    @DisplayName("Custom test name containing spaces")
    void testDivide() throws CalculatorException {
        assertThrows(CalculatorException.class, () -> calculator.divide(1, 0));
        assertEquals(100, calculator.divide(100, 1));
    }

    @Test
    @DisplayName("Custom test name containing spaces")
    void testSingleAdd() {
        assertEquals(100, calculator.add(100));
    }
}
