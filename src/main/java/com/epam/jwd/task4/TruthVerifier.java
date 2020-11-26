package com.epam.jwd.task4;

public class TruthVerifier {
    public boolean isTruth(int a, int b, int c, int d) {
        int result = booleanToBinary(isEven(a)) + booleanToBinary(isEven(b)) + booleanToBinary(isEven(c)) + booleanToBinary(isEven(d));
        if (result >= 2) {
            return true;
        }
        return false;
    }

    private boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    private int booleanToBinary(boolean bool) {
        if (bool) {
            return 1;
        }
        return 0;
    }
}
