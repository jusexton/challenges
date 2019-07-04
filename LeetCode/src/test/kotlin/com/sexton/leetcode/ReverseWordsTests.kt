package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class ReverseWordsTests {
    @ParameterizedTest
    @ArgumentsSource(ReverseWordsWithoutRedundantWhitespaceTestsArgumentProvider::class)
    fun `should correctly reverse words that do not have redundant whitespace`(expected: String, input: String) {
        assertEquals(expected, ReverseWords.reverseWords(input))
    }

    @ParameterizedTest
    @ArgumentsSource(ReverseWordsWithRedundantWhitespaceTestsArgumentProvider::class)
    fun `should correctly reverse words that have redundant whitespace`(expected: String, input: String) {
        assertEquals(expected, ReverseWords.reverseWords(input))
    }

    private class ReverseWordsWithRedundantWhitespaceTestsArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
            return Stream.of(
                Arguments.of("world! hello", "  hello world!  "),
                Arguments.of("example good a", "a good   example")
            )
        }
    }

    private class ReverseWordsWithoutRedundantWhitespaceTestsArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
            return Stream.of(
                Arguments.of("blue is sky the", "the sky is blue"),
                Arguments.of("There Hello", "Hello There")
            )
        }
    }
}