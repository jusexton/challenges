package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class AddBinaryTest {
    @ParameterizedTest
    @ArgumentsSource(AddBinaryTestsArgumentProvider::class)
    fun `should return the result of adding the two binary numbers`(
        expected: String,
        binaryOne: String,
        binaryTwo: String
    ) {
        assertEquals(expected, AddBinary.addBinary(binaryOne, binaryTwo))
    }

    private class AddBinaryTestsArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
            return Stream.of(
                Arguments.of("100", "11", "1"),
                Arguments.of("10101", "1011", "1010"),
                Arguments.of(
                    "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000",
                    "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                    "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
                )
            )
        }
    }
}