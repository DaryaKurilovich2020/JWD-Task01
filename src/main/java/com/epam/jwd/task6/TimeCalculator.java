package com.epam.jwd.task6;

import com.epam.jwd.task2.InvalidDateException;

public class TimeCalculator {
    private final int seconds;

    public TimeCalculator(int seconds) throws InvalidDateException {
        checkSeconds(seconds);
        this.seconds = seconds;
    }

    public int getHours() {
        return seconds / 3600;
    }

    public int getMinutes() {
        return (seconds % 3600) / 60;
    }

    public int getSeconds() {
        return (seconds % 3600) % 60;
    }
    private static void checkSeconds(int seconds) throws InvalidDateException {
        if(seconds<0){
            throw new InvalidDateException("Seconds number can't be less than zero");
        }
    }
}