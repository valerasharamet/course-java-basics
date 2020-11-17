package com.rakovets.course.javabasics.practice.exceptionhandling;

public class ExistsChar {
    public int getExistsChar(String str, Character character) throws CharException {
        int i = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                break;
            }
        }
        if (i == str.length()) {
            throw new CharException("Character " + character + " not Exists");
        }
        return i;
    }
}
