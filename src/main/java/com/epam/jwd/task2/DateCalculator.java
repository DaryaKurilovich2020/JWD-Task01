package com.epam.jwd.task2;

public class DateCalculator {
    private int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final int year;
    private int month;

    public DateCalculator(int year) throws InvalidDateException {
        checkYear(year);
        this.year = year;
        if (this.isLeap()) {
            days[1] = 29;
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) throws InvalidDateException {
        checkMonth(month);
        this.month = month;
    }

    public int getDaysInMonth(int month) {
        return days[month - 1];
    }

    public boolean isLeap() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    private void checkYear(int year) throws InvalidDateException {
        if (year < 1) {
            throw new InvalidDateException("Year number can't be less than zero.");
        }
    }

    private static void checkMonth(int month) throws InvalidDateException {
        if (month < 1 || month > 12) {
            throw new InvalidDateException("Month number can't be less than zero or more than 12.");
        }
    }
}