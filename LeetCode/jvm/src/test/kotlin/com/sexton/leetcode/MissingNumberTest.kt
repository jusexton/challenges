package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class MissingNumberTest {
    @ParameterizedTest
    @ArgumentsSource(MissingNumberArgumentProvider::class)
    fun `should return the missing number in the array`(numbers: IntArray, expected: Int) {
        assertEquals(expected, MissingNumber.missingNumber(numbers))
    }

    private class MissingNumberArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> =
            Stream.of(
                Arguments.of(intArrayOf(0, 1, 2, 4), 3),
                Arguments.of(intArrayOf(4, 6, 3, 2, 1, 0), 5)
            )
    }
}
