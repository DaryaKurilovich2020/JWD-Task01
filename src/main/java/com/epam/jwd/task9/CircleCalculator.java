package com.epam.jwd.task9;

public class CircleCalculator {
    public static final double PI = Math.PI;

    public double getCircleLength(int r) {
        return 2 * PI * r;
    }

    public double getCircleSquare(int r) {
        return PI * Math.pow(r, 2);
    }

}
