package com.epam.jwd.task8;

import junit.framework.Assert;
import org.junit.Test;

public class FunctionCalculatorTest {
    @Test
    public void calculateTest() {
        int x = 3;
        FunctionCalculator calculator = new FunctionCalculator();
        double actual;
        actual = calculator.calculate(x);
        double expected = 9;
        Assert.assertEquals(expected, actual);
    }
}