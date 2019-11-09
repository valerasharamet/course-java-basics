package com.rakovets.course.challenge.oop.classes;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    Time(int commonSeconds) {
        this.hours = commonSeconds / (60 * 60);
        this.minutes = (commonSeconds % (60 * 60)) / 60;
        this.seconds = (commonSeconds % 60) % 60;
    }

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    int getHours() {
        return this.hours;
    }

    int getMinutes() {
        return this.minutes;
    }

    int getSeconds() {
        return this.seconds;
    }

    int getCommonSeconds() {
        return this.hours * 60 * 60 + this.minutes * 60 + this.seconds;
    }

    void display() {
        System.out.printf("%d:%d:%d\n", this.hours, this.minutes, this.seconds);
    }
}
