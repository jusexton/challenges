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
class SingleNumberTest {
    @ParameterizedTest
    @ArgumentsSource(SingleNumberArgumentProvider::class)
    fun `should return the digit that only appears once`(expected: Int, numbers: IntArray) {
        assertEquals(expected, SingleNumber.singleNumber(numbers))
    }

    class SingleNumberArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
            // Expected, Numbers
            return Stream.of(
                Arguments.of(1, intArrayOf(1, 2, 2)),
                Arguments.of(2, intArrayOf(5, 4, 5, 4, 2, 1, 1))
            )
        }
    }
}