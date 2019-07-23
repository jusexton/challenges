package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Timeout
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.concurrent.TimeUnit
import java.util.stream.Stream

@Timeout(50, unit = TimeUnit.MILLISECONDS)
class FactorialTrailingZeroTests {
    @ParameterizedTest
    @ArgumentsSource(FactorialTrailingZeroTestsArgumentProvider::class)
    fun `should give back the number of trailing zeroes at end of fibonacci sequence`(expected: Int, number: Int) {
        assertEquals(expected, FactorialTrailingZeroes.trailingZeroes(number))
    }

    class FactorialTrailingZeroTestsArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
            // Expected, Input
            return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 5),
                Arguments.of(1, 6),
                Arguments.of(1877, 7515),
                Arguments.of(2201, 8816),
                Arguments.of(452137076, 1808548329)
            )
        }
    }
}