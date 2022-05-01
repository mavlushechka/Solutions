package com.mavlushechka.solutions.jetbrainsacademy.Learn.Daily;

public class MultipleConstructorsTime {
}

class Time {
    public int hours;
    public int minutes;
    public int seconds;

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
}