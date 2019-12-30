package com.sexton.leetcode.util;

import com.sexton.leetcode.utils.PrimeUtils;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Timeout(value = 5, unit = TimeUnit.MILLISECONDS)
public class PrimeUtilsTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 961748927, 982451653})
    public void shouldReturnTrueWhenGivenPrimeNumber(final int primeNumber) {
        final boolean result = PrimeUtils.isPrime(primeNumber);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 6, 8, 10, 12, 1000000000})
    public void shouldReturnFalseWhenGivenNonPrimeNumber(final int nonPrimeNumber) {
        final boolean result = PrimeUtils.isPrime(nonPrimeNumber);
        assertFalse(result);
    }
}
