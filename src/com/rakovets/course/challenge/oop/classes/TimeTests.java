package com.rakovets.course.challenge.oop.classes;

public class TimeTests {
    public static void main(String[] args) {
        // Testing constructors
        Time time1 = new Time(1, 2, 3);
        time1.display();
        Time time2 = new Time(3723);
        time2.display();

        // Testing getters
        time1.display();
        System.out.printf("%d:%d:%d\n", time1.getHours(), time1.getMinutes(), time1.getSeconds());

        // Testing method `getCommonSeconds()`
        time1.display();
        System.out.println("Total seconds: " + time1.getCommonSeconds());
    }
}
