package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }
    public Time(int s) {
        this.hour = s / 3600;
        this.minute = s - this.hour * 3600;
        this.second = s - (s - this.hour * 3600) - (this.minute * 60);
    }
    public int getHour() {
        return this.hour;
    }
    public void setHour(int hr) {
        this.hour = hr;
    }
    public int getMinute() {
        return this.minute;
    }
    public void setMinute(int min) {
        this.minute = min;
    }
    public int getSecond() {
        return this.second;
    }
    public void setSecond(int sec) {
        this.second = sec;
    }
    public int getTotalSecond() {
        return this.hour * 3600 + this.minute*60 + this.second;
    }

}
