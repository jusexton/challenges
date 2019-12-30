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
public class ReverseBitsTest {
    @ParameterizedTest
    @ArgumentsSource(ReverseBitsTestArgumentProvider.class)
    public void shouldReturnTheReversedBitsOfGivenInteger(final int expected, final int input) {
        assertEquals(expected, ReverseBits.reverseBits(input));
    }

    private static class ReverseBitsTestArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(final ExtensionContext context) {
            return Stream.of(
                    Arguments.of(964176192, 43261596),
                    Arguments.of(-1073741825, -3)
            );
        }
    }
}
