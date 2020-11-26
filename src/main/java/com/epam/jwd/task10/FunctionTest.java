package com.epam.jwd.task10;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class FunctionTest {
    @Test
    public void functionTest() {
        Function function = new Function();
        Map<Double, Double> actual = function.calculate(0, 3 * Math.PI, Math.PI);
        Map<Double, Double> expected = new TreeMap<>();
        expected.put(0.0, 0.0);
        expected.put(Math.PI, 0.0);
        expected.put(2 * Math.PI, 0.0);
        expected.put(3 * Math.PI, 0.0);
        Assert.assertEquals(actual, expected);
    }
}