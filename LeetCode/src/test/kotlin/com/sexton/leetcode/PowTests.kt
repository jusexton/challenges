package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PowTests {
    @Test
    fun `should return the correct power given an x and n`() {
        assertEquals(1.0, Pow.pow(1.0, 0))
        assertEquals(4.0, Pow.pow(2.0, 2))
        assertEquals(0.25, Pow.pow(2.0, -2))
        assertEquals(1024.0, Pow.pow(2.0, 10))
        assertEquals(9.26100, Pow.pow(2.10000, 3))
        assertEquals(4.0, Pow.pow(-2.0, 2))
        assertEquals(-2529.95504, Pow.pow(-13.62608, 3))
    }
}