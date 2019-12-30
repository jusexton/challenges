package com.sexton.leetcode;

import com.sexton.leetcode.utils.PrimeSupplier;

import java.util.function.Supplier;

public final class CountPrimes {
    public static int countPrimesJava8Compliant(final int n) {
        final Supplier<Integer> primeSupplier = new PrimeSupplier();
        int count = 0;
        int currentPrime = primeSupplier.get();
        while (currentPrime < n) {
            count++;
            currentPrime = primeSupplier.get();
        }

        return count;
    }
}
