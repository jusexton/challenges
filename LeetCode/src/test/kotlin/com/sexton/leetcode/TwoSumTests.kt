package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class TwoSumTests {
    @ParameterizedTest
    @ArgumentsSource(TwoSumTestsArgumentProvider::class)
    fun `should return the two correct indices that result in the target sum`(
        expected: IntArray,
        numbers: IntArray,
        target: Int
    ) {
        assertArrayEquals(expected, TwoSum.twoSum(numbers, target))
    }

    @Test
    fun `should throw illegal argument exception when less than two numbers are given`() {
        // No Elements
        assertThrows<IllegalArgumentException> {
            TwoSum.twoSum(intArrayOf(), 0)
        }

        // One element
        assertThrows<IllegalArgumentException> {
            TwoSum.twoSum(intArrayOf(1), 0)
        }
    }

    private class TwoSumTestsArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
            // expected, numbers, target
            return Stream.of(
                Arguments.of(intArrayOf(0, 1), intArrayOf(1, 2), 3),
                Arguments.of(intArrayOf(0, 3), intArrayOf(5, 7, 21, 4, 13, 16), 9),
                Arguments.of(intArrayOf(3, 4), intArrayOf(5, 10, 21, 4, 14, 16), 18),
                Arguments.of(intArrayOf(2, 7), intArrayOf(10, 7, 3, 4, 12, 16, 100, 3), 6)
            )
        }
    }
}