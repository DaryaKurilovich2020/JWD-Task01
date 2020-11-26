package com.epam.jwd.task2;

import junit.framework.Assert;
import org.junit.Test;

public class DateCalculatorTest {
    @Test
    public void getDaysInMonthTest() {
        DateCalculator calculator = null;
        try {
            calculator = new DateCalculator(2020);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }
        int actual = calculator.getDaysInMonth(12);
        int expected = 31;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isLeapTest() {
        DateCalculator calculator = null;
        try {
            calculator = new DateCalculator(2020);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }
        boolean actual = calculator.isLeap();
        Assert.assertEquals(true, actual);
    }
}