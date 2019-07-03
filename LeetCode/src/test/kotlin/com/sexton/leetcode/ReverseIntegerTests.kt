package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseIntegerTests {
    @Test
    fun `should return 0 when given 0`() {
        assertEquals(0, 0.reverse())
    }

    @Test
    fun `should return the reversed integer value`() {
        assertEquals(123, 321.reverse())
    }

    @Test
    fun `should return the reversed integer value of negative number`() {
        assertEquals(-321, (-123).reverse())
    }

    @Test
    fun `should return the reversed integer value with no leading zeroes`() {
        assertEquals(123, 321000.reverse())
    }

    @Test
    fun `should return 0 when the reversed number results in an integer overflow`() {
        assertEquals(0, 1534236469.reverse())
    }
}