package com.sexton.leetcode.utils;

import java.util.function.Supplier;

public class PrimeSupplier implements Supplier<Integer> {
    private int currentCount = 2;

    @Override
    public Integer get() {
        while (true) {
            final boolean currentCountIsPrime = PrimeUtils.isPrime(currentCount);
            if (currentCountIsPrime) {
                return currentCount++;
            } else {
                currentCount++;
            }
        }
    }
}
