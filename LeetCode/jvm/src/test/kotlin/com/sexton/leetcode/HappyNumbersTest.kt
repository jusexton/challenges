package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class HappyNumbersTest {
    @ParameterizedTest
    @ArgumentsSource(HappyNumberArgumentProvider::class)
    fun `should return true when integer instance is happy`(number: Int) {
        assertTrue(number.isHappy())
    }

    @ParameterizedTest
    @ArgumentsSource(NonHappyNumberArgumentProvider::class)
    fun `should return false when integer instance is not happy`(number: Int) {
        assertFalse(number.isHappy())
    }

    private class HappyNumberArgumentProvider : ArgumentsProvider {
        override fun provideArguments(p0: ExtensionContext?): Stream<out Arguments> =
                Stream.of(
                        Arguments.of(1),
                        Arguments.of(7),
                        Arguments.of(10),
                        Arguments.of(13),
                        Arguments.of(19),
                        Arguments.of(23),
                        Arguments.of(28)

                )
    }

    private class NonHappyNumberArgumentProvider : ArgumentsProvider {
        override fun provideArguments(p0: ExtensionContext?): Stream<out Arguments> =
                Stream.of(
                        Arguments.of(0),
                        Arguments.of(5),
                        Arguments.of(12),
                        Arguments.of(24),
                        Arguments.of(25),
                        Arguments.of(29)
                )
    }
}

