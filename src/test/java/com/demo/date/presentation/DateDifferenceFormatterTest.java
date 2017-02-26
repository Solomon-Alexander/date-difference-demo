package com.demo.date.presentation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import com.demo.date.domain.MyDate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class DateDifferenceFormatterTest {
    private static final int DIFFERENCE = 66;
    @Mock
    private MyDate first;
    @Mock
    private MyDate second;

    @Test
    public void formatsToCommaSeparatedString() {
        assertThat(new DateDifferenceFormatter().format(first, second, DIFFERENCE), is("first, second, 66"));
    }
}
