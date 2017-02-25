package com.demo.date.factory;

import com.demo.date.domain.MyDate;
import com.demo.date.domain.Month;
import com.demo.date.validator.DateValidator;

public class DateFactory {

    public MyDate createWith(int day, int numbericalMonth, int year) {
        Month month = Month.fromNumber(DateValidator.validatedMonth(numbericalMonth));
        return new MyDate(DateValidator.validatedDayInMonth(day, month), month, DateValidator.validatedYear(year));
    }

}
