package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Timeout
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.concurrent.TimeUnit
import java.util.stream.IntStream
import java.util.stream.Stream

@Timeout(50, unit = TimeUnit.MILLISECONDS)
class AddDigitsTest {
    @ParameterizedTest
    @ArgumentsSource(SingleDigitIntegerArgumentProvider::class)
    fun `should return given integer if it only consists of a single digit`(input: Int, expected: Int) {
        assertEquals(expected, AddDigits.addDigits(input))
    }

    @ParameterizedTest
    @ArgumentsSource(MultipleDigitIntegerArgumentProvider::class)
    fun `should return sum of digits until result is a single digit`(input: Int, expected: Int) {
        assertEquals(expected, AddDigits.addDigits(input))
    }

    private class SingleDigitIntegerArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> =
            IntStream.rangeClosed(0, 9)
                .mapToObj {
                    Arguments.of(it, it)
                }
    }

    private class MultipleDigitIntegerArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> =
            Stream.of(
                Arguments.of(38, 2)
            )
    }
}
