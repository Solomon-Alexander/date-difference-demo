package com.demo.date.validator;

import static java.lang.String.format;
import java.util.regex.Pattern;
import com.demo.date.domain.Month;

public class DateValidator {
	
	private static final Pattern CORRECT_FORMAT = Pattern.compile("\\d\\d \\d\\d \\d\\d\\d\\d");
	 
    public static String validated(String date) {
        if (isNull(date) || !isCorrectlyFormatted(date)) {
            throw new IllegalArgumentException(String.format("Expected to be of form '00 00 0000', found '%s'", date));
        }
        return date;
    }

    public static boolean isNull(Object object) {
        return object == null;
    }

    public static boolean isCorrectlyFormatted(String date) {
        return CORRECT_FORMAT.matcher(date).matches();
    }
    
    public static int validatedDayInMonth(int day, Month month) {
        if (day < 1 || day > month.length()) {
            throw new IllegalArgumentException(format("Expected day to fall within the range specified by month %s " +
                    "(1-%d), found '%d'", month, month.length(), day));
        }
       return day;
   }
    
    public static int validatedMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException(format("Expected month to fall within range 1-12, found '%s'", month));
        }
        return month;
    }

    public static int validatedYear(int year) {
        if (year < 1900 || year > 2010) {
            throw new IllegalArgumentException(format("Expected year to fall within range 1900-2010, found '%s'", year));
        }
        return year;
    }

}
