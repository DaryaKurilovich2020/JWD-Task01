package com.epam.jwd.task1;

public class LastDigitCalculator {
    public int calculateLastDigit(int number) {
        int lastDigit = number % 10;
        if (lastDigit <= 3) {
            return (int) Math.pow(lastDigit, 2);
        } else {
            return (int) (Math.pow(lastDigit, 2) % 10);
        }
    }
}
