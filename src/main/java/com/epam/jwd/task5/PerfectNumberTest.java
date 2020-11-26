package com.epam.jwd.task5;

import junit.framework.Assert;
import org.junit.Test;

public class PerfectNumberTest {
    @Test
    public void isPerfectTest() {
        PerfectNumber number = new PerfectNumber();
        int a = 12;
        boolean actual = number.isPerfect(a);
        Assert.assertEquals(false, actual);
    }
}