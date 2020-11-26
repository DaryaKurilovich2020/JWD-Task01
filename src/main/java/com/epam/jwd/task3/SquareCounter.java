package com.epam.jwd.task3;

public class SquareCounter {
    public double getInscribedSquareArea(double square) {
        double side = Math.sqrt(square);
        double newSide = Math.sqrt(2) * side / 2;
        return Math.pow(newSide, 2);
    }

    public double getDifference(double square) {
        return square / getInscribedSquareArea(square);
    }
}
