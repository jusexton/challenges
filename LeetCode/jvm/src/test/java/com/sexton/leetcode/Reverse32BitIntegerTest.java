package com.sexton.leetcode;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Reverse32BitIntegerTest {
    @ParameterizedTest
    @ArgumentsSource(ReversedIntegerTestArgumentProvider.class)
    public void shouldReturnIntegerCorrectlyReversed(final int expected, final int integer) {
        assertEquals(expected, ReverseInteger.reverseInteger(integer));
    }

    private static class ReversedIntegerTestArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            // expected, input
            return Stream.of(
                    Arguments.of(0, 0),
                    Arguments.of(321, 123),
                    Arguments.of(123, 321),
                    Arguments.of(321, 1230),
                    Arguments.of(0, 1534236469)
            );
        }
    }
}
