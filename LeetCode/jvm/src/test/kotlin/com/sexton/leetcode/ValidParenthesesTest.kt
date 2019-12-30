package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class ValidParenthesesTest {
    @Test
    fun `should return true when given empty string`() {
        assertTrue(ValidParentheses.isValid(""))
    }

    @ParameterizedTest
    @ValueSource(strings = ["()", "{}", "[]", "[()]", "()()", "{}{}{[()()]}"])
    fun `should return true when given string with valid parentheses`(validString: String) {
        assertTrue(ValidParentheses.isValid(validString))
    }

    @ParameterizedTest
    @ValueSource(strings = ["[())]", "()(()", "{}{}({[()()]}", ")"])
    fun `should return false when given invalid parentheses string`(invalidString: String) {
        assertFalse(ValidParentheses.isValid(invalidString))
    }
}
