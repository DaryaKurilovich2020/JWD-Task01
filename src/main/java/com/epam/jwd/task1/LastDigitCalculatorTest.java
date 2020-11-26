package com.epam.jwd.task1;

import junit.framework.Assert;
import org.junit.Test;

public class LastDigitCalculatorTest {
    @Test
    public void testLastDigitCalculator() {
        int x = 9;
        int expected = 1;
        int actual;
        LastDigitCalculator calculator = new LastDigitCalculator();
        actual = calculator.calculateLastDigit(x);
        Assert.assertEquals(expected, actual);
    }

}
