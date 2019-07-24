package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Timeout
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import java.util.concurrent.TimeUnit

@Timeout(50, unit = TimeUnit.MILLISECONDS)
class ValidPalindromeTest {
    @ParameterizedTest
    @ValueSource(strings = ["", "tacocat", "racecar", "A man, a plan, a canal: Panama"])
    fun `should return true when given a valid palindrome`(input: String) {
        assertTrue(ValidPalindrome.isPalindrome(input))
    }

    @ParameterizedTest
    @ValueSource(strings = ["not a palindrome", "nope"])
    fun `should return false when given a invalid palindrome`(input: String) {
        assertFalse(ValidPalindrome.isPalindrome(input))
    }
}