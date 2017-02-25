package com.demo.date.presentation;

import com.demo.date.domain.MyDate;

public class DateDifferenceFormatter {
    public String format(MyDate first, MyDate second, int difference) {
        return String.format("%s, %s, %d", first, second, difference);
    }
}
