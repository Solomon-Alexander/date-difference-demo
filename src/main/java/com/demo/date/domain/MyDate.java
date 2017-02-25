package com.demo.date.domain;

import static java.lang.Math.abs;
import com.demo.date.domain.Month;

public class MyDate {
    private final int day;
    private final Month month;
    private final int year;

    public MyDate(int day, Month month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int differenceInDaysFrom(MyDate second) {
        return abs(dayDifference(second) + monthDifference(second) + yearDifference(second));
    }

    private int dayDifference(MyDate second) {
        return (second.day - this.day);
    }

    private int monthDifference(MyDate second) {
        return month.differenceInDaysFrom(second.month);
    }

    private int yearDifference(MyDate second) {
        return (365 * (second.year - this.year));
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", leftPad(day), leftPad(month.asNumber()), year);
    }

    public int getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    private String leftPad(int value) {
        return String.format((value < 10) ? "0%d" : "%d", value);
    }
}
