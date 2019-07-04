package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class MajorityElementTests {
    @ParameterizedTest
    @ArgumentsSource(MajorityElementTestsArgumentProvider::class)
    fun `should return the element that appears the majority of the time`(expected: Int, numbers: IntArray) {
        assertEquals(expected, MajorityElement.majorityElement(numbers))
    }

    private class MajorityElementTestsArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
            // expected, numbers
            return Stream.of(
                Arguments.of(5, intArrayOf(5, 5, 2)),
                Arguments.of(2, intArrayOf(2, 2, 2, 1, 1, 1, 2)),
                Arguments.of(5, intArrayOf(5, 2, 3, 4, 5, 5, 5))
            )
        }
    }
}