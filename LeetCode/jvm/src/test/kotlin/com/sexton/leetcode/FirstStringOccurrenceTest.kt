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
class FirstStringOccurrenceTest {
    @ParameterizedTest
    @ArgumentsSource(FirstStringOccurrenceTestArgumentProvider::class)
    fun `should return the index of the first occurrence of substring`(
        expected: Int,
        haystack: String,
        needle: String
    ) {
        assertEquals(expected, FirstStringOccurrence.strStr(haystack, needle))
    }

    private class FirstStringOccurrenceTestArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
            // Expected, Haystack, Needle
            return Stream.of(
                Arguments.of(2, "hello", "ll"),
                Arguments.of(-1, "aaa", "bba")
            )
        }
    }
}