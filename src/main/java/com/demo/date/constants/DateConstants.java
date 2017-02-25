package com.demo.date.constants;

import java.util.HashMap;
import java.util.Map;

public class DateConstants {
    public static Map<String, Integer> numOfDaysEachMonth = new HashMap<String, Integer>();

    static {
        numOfDaysEachMonth.put("1", 31);
        numOfDaysEachMonth.put("2", 28);
        numOfDaysEachMonth.put("2L", 29);
        numOfDaysEachMonth.put("3", 31);
        numOfDaysEachMonth.put("4", 30);
        numOfDaysEachMonth.put("5", 31);
        numOfDaysEachMonth.put("6", 30);
        numOfDaysEachMonth.put("7", 31);
        numOfDaysEachMonth.put("8", 31);
        numOfDaysEachMonth.put("9", 30);
        numOfDaysEachMonth.put("10", 31);
        numOfDaysEachMonth.put("11", 30);
        numOfDaysEachMonth.put("12", 31);
    }

}
