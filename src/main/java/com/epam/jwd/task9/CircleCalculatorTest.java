package com.epam.jwd.task9;

import junit.framework.Assert;
import org.junit.Test;

public class CircleCalculatorTest {
    @Test
    public void testCircleLengthCalculator() {
        int r = 2;
        double expected = 2 * Math.PI * r;
        CircleCalculator calculator = new CircleCalculator();
        double actual = calculator.getCircleLength(r);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCircleSquareCalculator() {
        int r = 2;
        double expected = Math.PI * Math.pow(r, 2);
        CircleCalculator calculator = new CircleCalculator();
        double actual = calculator.getCircleSquare(r);
        Assert.assertEquals(expected, actual);
    }
}
