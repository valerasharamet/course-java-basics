package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    public Time(int s) {
        second = s%60;
        minute = ((s - second)/60) %60;
        hour = (((s - second)/60) - minute)/60;

    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public int getTotalSecond() {
        return this.hour * 3600 + this.minute*60 + this.second;
    }

}
