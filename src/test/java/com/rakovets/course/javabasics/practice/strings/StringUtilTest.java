package com.rakovets.course.javabasics.practice.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    private static StringUtil stringUtil;

    @BeforeAll
    static void init() {
        stringUtil = new StringUtil();

    }

    @Test
//task1
    void contactTest() {
        Assertions.assertEquals("Good morning", stringUtil.concatString("Good ", "morning"));
        Assertions.assertEquals("Good morning", stringUtil.concatString("Good", " morning"));
        Assertions.assertEquals("Goodmorning", stringUtil.concatString("Good", "morning"));
        Assertions.assertEquals("asd223++", stringUtil.concatString("asd2", "23++"));
    }

    @Test
//task2
    void findIndexTest() {
        Assertions.assertEquals(3, stringUtil.findIndex("Good ", 'd'));
        Assertions.assertEquals(30, stringUtil.findIndex("Whou baby, baby, thunderstruck!", '!'));
        Assertions.assertEquals(-1, stringUtil.findIndex("Cause I'm T.N.T., I'm dynamite.", '!'));
        Assertions.assertEquals(15, stringUtil.findIndex("I'm on the highway to hell.", 'w'));
    }

    @Test
//task3
    void stringEqualsTest() {
        Assertions.assertEquals(true, stringUtil.stringEquals("I'm on the highway to hell.", "I'm on the highway to hell."));
        Assertions.assertEquals(false, stringUtil.stringEquals("Good morning", "Good day"));
        Assertions.assertEquals(false, stringUtil.stringEquals("Good12 morning", "Good12day"));
        Assertions.assertEquals(true, stringUtil.stringEquals("Good+morning!", "Good+morning!"));

    }

    @Test
//task4
    void deleteBlankSpaceTest() {
        Assertions.assertEquals("good morning", stringUtil.deleteBlankSpace(" Good morning "));
        Assertions.assertEquals("cause i'm t.n.t., i'm dynamite.", stringUtil.deleteBlankSpace(" Cause I'm T.N.T., I'm dynamite."));
        Assertions.assertEquals("+whou baby, baby, thunderstruck!", stringUtil.deleteBlankSpace("+Whou baby, baby, thunderstruck!"));
    }

    @Test
//task5
    void extractSubstringTest() {
        Assertions.assertEquals("there is no decision", stringUtil.extractSubstring("Good"));
        Assertions.assertEquals(" class represents chara", stringUtil.extractSubstring("The String class represents character strings"));
    }

    @Test
//task6
    void replaceСharacterTest() {
        Assertions.assertEquals("Good morning:)", stringUtil.replaceCharter("Good morning:("));
        Assertions.assertEquals("Good12:)morning:)", stringUtil.replaceCharter("Good12:(morning:("));
        Assertions.assertEquals("Good12:)morning", stringUtil.replaceCharter("Good12:)morning"));
    }

    @Test
//task7
    void startsAndEndsWithTest() {
        Assertions.assertEquals(true, stringUtil.startsAndEndsWith("Hello", "Hello"));
        Assertions.assertEquals(true, stringUtil.startsAndEndsWith("HelloHello", "Hello"));
        Assertions.assertEquals(true, stringUtil.startsAndEndsWith("Hello World Hello", "Hello"));
        Assertions.assertEquals(false, stringUtil.startsAndEndsWith("Hello World Hell", "Hello"));
        Assertions.assertEquals(false, stringUtil.startsAndEndsWith("Hello World Hello!", "Hello"));
        Assertions.assertEquals(false, stringUtil.startsAndEndsWith("Java", "Hello"));
    }

    @Test
//task8
    void getVowelsTest() {
        Assertions.assertEquals(4, stringUtil.getVowels("Good morning"));
        Assertions.assertEquals(9, stringUtil.getVowels("Whou baby, baby, thunderstruck!"));
        Assertions.assertEquals(9, stringUtil.getVowels("Cause I'm T.N.T., I'm dynamite."));
        Assertions.assertEquals(8, stringUtil.getVowels("I'm on the highway to hell."));
    }

    @Test
//task9
    void getDotCommaExclamationmarkTest() {
        Assertions.assertEquals(3, stringUtil.getDotCommaExclamationmark("Whou baby, baby, thunderstruck!"));
        Assertions.assertEquals(5, stringUtil.getDotCommaExclamationmark("Cause I'm T.N.T., I'm dynamite."));
        Assertions.assertEquals(1, stringUtil.getDotCommaExclamationmark("I'm on the highway to hell."));
    }

    @Test
//task10
    void getStringReverseTest() {
        Assertions.assertEquals(false, stringUtil.getStringReverse("Good"));
        Assertions.assertEquals(true, stringUtil.getStringReverse("level"));
        Assertions.assertEquals(false, stringUtil.getStringReverse("Morning"));
        Assertions.assertEquals(true, stringUtil.getStringReverse("mam"));
    }

    @Test//task11
    void getStringArrayTest() {
        Assertions.assertEquals(new String[]{"good, day"}, stringUtil.getStringArray("good day", 4));
    }

    @Test
//task12
    void getNumberWordsTest() {
        Assertions.assertEquals(2, stringUtil.getNumberWords("Good  morning."));
        Assertions.assertEquals(6, stringUtil.getNumberWords("I'm on the highway to hell."));
        Assertions.assertEquals(3, stringUtil.getNumberWords("Hello World Hello"));
    }

    @Test//task13
    void getInitialsTest() {
        Assertions.assertEquals("S.V.A.", stringUtil.getInitials("sharamet valery andreevich"));
        Assertions.assertEquals("L.V.V.", stringUtil.getInitials("liliput vladimir Vladimirovich"));
        Assertions.assertEquals("P.V.P.", stringUtil.getInitials("Pupkin Vasiliy petrovich"));
    }

    @Test//task14
    void getDigitsInTextTest() {
        Assertions.assertEquals("109", stringUtil.getDigitsInText("Because for 10 girls According to statistics, 9 guys"));
        Assertions.assertEquals("3", stringUtil.getDigitsInText("September 3rd is the day of farewell"));
        Assertions.assertEquals("7000", stringUtil.getDigitsInText("7000 above ground"));
    }

    @Test//task15
    void getCharNonRecurringTest() {
        Assertions.assertEquals("ls", stringUtil.getCharNonRecurring("Girl","Girs"));
        Assertions.assertEquals("abvegrund", stringUtil.getCharNonRecurring("above","ground"));
    }



}
