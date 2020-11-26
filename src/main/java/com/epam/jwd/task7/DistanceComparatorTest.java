package com.epam.jwd.task7;

import junit.framework.Assert;
import org.junit.Test;

public class DistanceComparatorTest {
    @Test
    public void compareDistanceTest() {
        Point a = new Point(3, 4);
        Point b = new Point(5, 12);
        int expected = -1;
        DistanceComparator comparator = new DistanceComparator();
        int actual = comparator.compareDistance(a, b);
        Assert.assertEquals(expected, actual);
    }
}