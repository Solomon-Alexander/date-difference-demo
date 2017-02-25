package com.demo.date.parser;

import static java.lang.Integer.valueOf;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.demo.date.domain.MyDate;
import com.demo.date.factory.DateFactory;
import com.demo.date.constants.DateConstants;
import com.demo.date.validator.DateValidator;

public class DateParser {
    
    private final DateFactory dateFactory;

	public DateParser(DateFactory dateFactory) {
        this.dateFactory = dateFactory;
    }
    
    public MyDate parse(String date) {
        String[] fragments = DateValidator.validated(date).split(" ");
        return dateFactory.createWith(valueOf(fragments[0]),valueOf(fragments[1]),valueOf(fragments[2]));
    }

}
