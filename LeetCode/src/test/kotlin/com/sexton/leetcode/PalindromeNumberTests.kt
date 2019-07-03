package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class PalindromeNumberTests {
    @ParameterizedTest
    @ValueSource(ints = [101, 22, 5, 77, 1001])
    fun `should return true if number reversed is the same forwards`(number: Int) {
        assertTrue(PalindromeNumber.isPalindrome(number))
    }

    @ParameterizedTest
    @ValueSource(ints = [-101, 15, 21])
    fun `should return false if number reversed is not the same forwards`(number: Int) {
        assertFalse(PalindromeNumber.isPalindrome(number))
    }
}