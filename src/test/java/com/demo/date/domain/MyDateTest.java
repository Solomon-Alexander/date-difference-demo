package com.demo.date.domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static com.demo.date.domain.Month.FEBRUARY;

public class MyDateTest {
    private static final MyDate TODAY = new MyDate(1, FEBRUARY, 2003);
    private static final MyDate TOMORROW = new MyDate(2, FEBRUARY, 2003);
    private static final MyDate FEB_27TH_2010 = new MyDate(27, FEBRUARY, 2010);
    private static final MyDate MARCH_2ND = new MyDate(2, Month.MARCH, 2010);
    private static final MyDate FEBRUARY_1ST = new MyDate(1, Month.FEBRUARY, 2010);
    private static final MyDate MARCH_1ST = new MyDate(1, Month.MARCH, 2010);
    private static final MyDate JAN_1ST_2001 = new MyDate(1, Month.JANUARY, 2001);
    private static final MyDate JAN_1ST_2002 = new MyDate(1, Month.JANUARY, 2002);
    private static final MyDate NOV_1ST_2001 = new MyDate(1, Month.NOVEMBER, 2001);
    private static final MyDate DEC_31ST_2001 = new MyDate(31, Month.DECEMBER, 2001);

    @Test
    public void differentAccordingToDay() {
        assertThat(TODAY.differenceInDaysFrom(TOMORROW), is(1));
    }

    @Test
    public void differentAccordingToMonth() {
        assertThat(FEBRUARY_1ST.differenceInDaysFrom(MARCH_1ST), is(28));
    }

    @Test
    public void differentHonouringMonthLength() {
        assertThat(FEB_27TH_2010.differenceInDaysFrom(MARCH_2ND), is(3));
    }

    @Test
    public void differentAccordingToYear() {
        assertThat(JAN_1ST_2001.differenceInDaysFrom(JAN_1ST_2002), is(365));
    }

    @Test
    public void toStringShouldRenderSpaceDelimitedDate() {
        assertThat(DEC_31ST_2001.toString(), is("31 12 2001"));
    }

    @Test
    public void toStringShouldLeftPadDaysOfOneDigitWithLeadingZero() {
        assertThat(NOV_1ST_2001.toString(), is("01 11 2001"));
    }

    @Test
    public void toStringShouldLeftPadMonthsOfOneDigitWithLeadingZero() {
        assertThat(FEB_27TH_2010.toString(), is("27 02 2010"));
    }

    @Test
    public void differenceIsAbsolute() {
         assertThat(TODAY.differenceInDaysFrom(TOMORROW), is(1));
         assertThat(TOMORROW.differenceInDaysFrom(TODAY), is(1));
    }
}
