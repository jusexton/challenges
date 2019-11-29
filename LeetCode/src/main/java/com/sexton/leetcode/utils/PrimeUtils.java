package com.sexton.leetcode.utils;

public final class PrimeUtils {
    private PrimeUtils() {

    }

    public static boolean isPrime(final long number) {
        if (number < 2) {
            return false;
        }

        final int squareRoot = (int) Math.sqrt(number) + 1;
        for (long i = 2; i < squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
