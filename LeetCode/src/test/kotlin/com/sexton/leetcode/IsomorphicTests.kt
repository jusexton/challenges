package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class IsomorphicTests {
    @Test
    fun `should return true when given two strings are isomorphic`() {
        assertTrue(Isomorphic.isIsomorphic("paper", "title"))
        assertTrue(Isomorphic.isIsomorphic("egg", "add"))
    }

    @Test
    fun `should return false when given two strings are different lengths`() {
        assertFalse(Isomorphic.isIsomorphic("123", "12345"))
    }

    @Test
    fun `should return false when given two string that are not isomorphic`() {
        assertFalse(Isomorphic.isIsomorphic("foo", "bar"))
    }
}