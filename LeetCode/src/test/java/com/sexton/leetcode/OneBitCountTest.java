package com.sexton.leetcode;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Timeout(value = 50, unit = TimeUnit.MILLISECONDS)
public class OneBitCountTest {
    @ParameterizedTest
    @ArgumentsSource(OneBitCountTestArgumentSource.class)
    public void shouldReturnTheNumberOfOneBitsInGivenInteger(final int expected, final int input) {
        assertEquals(expected, OneBitCount.hammingWeight(input));
    }

    private static class OneBitCountTestArgumentSource implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(final ExtensionContext context) {
            return Stream.of(
                    Arguments.of(0, 0),
                    Arguments.of(3, 11),
                    Arguments.of(1, 4)
            );
        }
    }
}
