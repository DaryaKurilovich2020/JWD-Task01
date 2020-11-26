package com.epam.jwd.task6;

import com.epam.jwd.task2.InvalidDateException;
import junit.framework.Assert;
import org.junit.Test;

public class TimeCalculatorTest {
    @Test
    public void getHoursTest() {
        TimeCalculator calculator = null;
        try {
            calculator = new TimeCalculator(7259);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }
        assert calculator != null;
        int actual = calculator.getHours();
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMinutesTest() {
        TimeCalculator calculator = null;
        try {
            calculator = new TimeCalculator(7267);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }
        assert calculator != null;
        int actual = calculator.getHours();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSecondsTest() {
        TimeCalculator calculator = null;
        try {
            calculator = new TimeCalculator(7287);
        } catch (InvalidDateException e) {
            e.printStackTrace();
        }
        assert calculator != null;
        int actual = calculator.getHours();
        int expected = 27;
        Assert.assertEquals(expected, actual);
    }
}