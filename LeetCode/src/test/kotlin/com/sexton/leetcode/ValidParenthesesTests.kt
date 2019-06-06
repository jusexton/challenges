package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ValidParenthesesTests {
    @Test
    fun `should return true when given empty string`() {
        assertTrue(ValidParentheses.isValid(""))
    }

    @Test
    fun `should return true when given string with valid parentheses`() {
        assertTrue(ValidParentheses.isValid("()"))
        assertTrue(ValidParentheses.isValid("{}"))
        assertTrue(ValidParentheses.isValid("[]"))
        assertTrue(ValidParentheses.isValid("[()]"))
        assertTrue(ValidParentheses.isValid("()()"))
        assertTrue(ValidParentheses.isValid("{}{}{[()()]}"))
    }

    @Test
    fun `should return false when given invalid parentheses string`() {
        assertFalse(ValidParentheses.isValid("[())]"))
        assertFalse(ValidParentheses.isValid("()(()"))
        assertFalse(ValidParentheses.isValid("{}{}({[()()]}"))
    }
}