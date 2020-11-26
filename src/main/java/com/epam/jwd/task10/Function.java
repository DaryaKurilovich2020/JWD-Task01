package com.epam.jwd.task10;

import java.util.Map;
import java.util.TreeMap;

public class Function {
    private Map<Double, Double> values;

    public Map<Double, Double> calculate(double start, double end, double step) {
        values = new TreeMap<>();
        while (start <= end) {
            double x = start;
            values.put(x, Math.tan(x));
            start += step;
        }
        return values;
    }
}
