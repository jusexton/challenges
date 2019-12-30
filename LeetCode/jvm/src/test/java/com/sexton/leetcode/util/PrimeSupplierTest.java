package com.sexton.leetcode.util;

import com.sexton.leetcode.utils.PrimeSupplier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PrimeSupplierTest {
    private PrimeSupplier primeSupplier;

    @BeforeEach
    public void setup() {
        this.primeSupplier = new PrimeSupplier();
    }

    @ParameterizedTest
    @ArgumentsSource(PrimeSupplierTestArgumentProvider.class)
    public void primeSupplierShouldCorrectlySupplyValidPrimes(final Integer[] expected, final int count) {
        final Integer[] actual = Stream.generate(primeSupplier).limit(count).toArray(Integer[]::new);
        assertArrayEquals(expected, actual);
    }

    private static class PrimeSupplierTestArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(new Integer[]{}, 0),
                    Arguments.of(new Integer[]{2, 3, 5}, 3),
                    Arguments.of(new Integer[]{2, 3, 5, 7, 11, 13}, 6)
            );
        }
    }
}
