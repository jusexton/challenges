package com.sexton.leetcode;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountPrimesTest {
    @ParameterizedTest
    @ArgumentsSource(CountPrimesTestArgumentProvider.class)
    public void shouldReturnTheNumberOfPrimesBelowGivenNumber(final int expected, final int value) {
        final int actual = CountPrimes.countPrimes(value);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ArgumentsSource(CountPrimesTestArgumentProvider.class)
    public void shouldReturnTheNumberOfPrimesBelowGivenNumberAndBeCompliantWithJava8(final int expected, final int value) {
        final int actual = CountPrimes.countPrimesJava8Compliant(value);
        assertEquals(expected, actual);
    }

    private static class CountPrimesTestArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(0, 0),
                    Arguments.of(0, 2),
                    Arguments.of(2, 4),
                    Arguments.of(4, 10)
            );
        }
    }
}
