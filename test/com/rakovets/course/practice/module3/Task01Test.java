package com.rakovets.course.practice.module3;

import com.rakovets.course.util.ConsoleReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task01Test {

    static Stream<Arguments> provideWeekdays() {
        return Stream.of(
                Arguments.of("1", "monday"),
                Arguments.of("2", "tuesday"),
                Arguments.of("3", "wednesday"),
                Arguments.of("4", "thursday"),
                Arguments.of("5", "friday"),
                Arguments.of("6", "saturday"),
                Arguments.of("7", "sunday")
        );
    }

    @BeforeEach
    void setUpStreams() {
        System.setOut(ConsoleReader.getEmptyOutPrintStream());
    }

    @AfterEach
    void cleanUpStreams() {
        System.setOut(null);
    }

    @ParameterizedTest
    @MethodSource("provideWeekdays")
    void testTask01(String input, String expected) {
        Task01.main(new String[]{input});
        assertEquals(ConsoleReader.getConsoleContent(), expected);
    }
}