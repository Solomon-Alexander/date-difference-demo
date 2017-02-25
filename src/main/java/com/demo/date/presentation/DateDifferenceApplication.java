package com.demo.date.presentation;

import com.demo.date.parser.DateParser;
import com.demo.date.domain.MyDate;
import com.demo.date.factory.DateFactory;

import java.io.PrintStream;

public class DateDifferenceApplication {
    private final PrintStream output;
    private final ArgumentParser argumentParser;
    private final DateParser dateParser;
    private final DateDifferenceFormatter dateDifferenceFormatter;

    public static void main(String... arguments) {
        new DateDifferenceApplication(System.out, new ArgumentParser(), new DateParser(new DateFactory()),
                new DateDifferenceFormatter()).difference(arguments);
    }

    public DateDifferenceApplication(PrintStream out, ArgumentParser argumentParser, DateParser dateParser, DateDifferenceFormatter dateDifferenceFormatter) {
        this.output = out;
        this.argumentParser = argumentParser;
        this.dateParser = dateParser;
        this.dateDifferenceFormatter = dateDifferenceFormatter;
    }

    public void difference(String... argument) {
        String[] arguments = argumentParser.parse(argument);
        MyDate first = dateParser.parse(arguments[0]);
        MyDate second = dateParser.parse(arguments[1]);
        int difference = first.differenceInDaysFrom(second);
        output.println(dateDifferenceFormatter.format(first, second, difference));
    }
}
