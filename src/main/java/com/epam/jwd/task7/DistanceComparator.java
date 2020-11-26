package com.epam.jwd.task7;

public class DistanceComparator {
    public int compareDistance(Point a, Point b) {
        Double distanceA = calculateDistance(a);
        Double distanceB = calculateDistance(b);
        return distanceA.compareTo(distanceB);
    }

    public static double calculateDistance(Point a) {
        return Math.sqrt(Math.pow(a.getX(), 2) + Math.pow(a.getY(), 2));
    }
}