package com.epam.jwd.task5;

public class PerfectNumber {
    public boolean isPerfect(int a) {
        return this.getDividersSum(a) == a;
    }

    private int getDividersSum(int number) {
        int sum = 0;
        for (long i = 2; i <= Math.floor(Math.sqrt(number)); i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}