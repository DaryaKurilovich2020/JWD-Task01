package com.epam.jwd.task8;

public class FunctionCalculator {
    public double calculate(int x) {
        if (x >= 3) {
            return calculateForXLessThan3(x);
        } else {
            return calculateForXMoreThan3(x);
        }
    }

    public static double calculateForXLessThan3(int x) {
        return 1 / (Math.pow(x, 3) - 6);
    }

    public static double calculateForXMoreThan3(int x) {
        return -Math.pow(x, 2) + 3 * x + 9;
    }
}