package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class LengthOfLastWordTest {
    @ParameterizedTest
    @ArgumentsSource(LengthOfLastWordTestsArgumentProvider::class)
    fun `should return the length of the last word in a string`(expected: Int, stringInput: String) {
        assertEquals(expected, LengthOfLastWord.lengthOfLastWord(stringInput))
    }

    private class LengthOfLastWordTestsArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
            // expected size, input string
            return Stream.of(
                Arguments.of(1, "a "),
                Arguments.of(5, "Hello There"),
                Arguments.of(5, "Hello"),
                Arguments.of(0, " ")
            )
        }
    }
}