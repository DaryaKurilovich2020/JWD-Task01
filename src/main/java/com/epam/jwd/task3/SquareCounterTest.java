package com.epam.jwd.task3;

import junit.framework.Assert;
import org.junit.Test;


public class SquareCounterTest {
    @Test
    public void getSquareTest() {
        SquareCounter counter = new SquareCounter();
        double square = 4;
        double actual = counter.getInscribedSquareArea(square);
        double expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDifferenceTest() {
        SquareCounter counter = new SquareCounter();
        double square = 4;
        double actual = counter.getDifference(square);
        double expected = 2;
        Assert.assertEquals(expected,actual);
    }
}