package com.sexton.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinStackTest {
    @Test
    fun `should correctly return the value on top of the stack`() {
        val stack = MinStack()

        stack.push(5)
        assertEquals(5, stack.top())

        stack.push(7)
        assertEquals(7, stack.top())

        stack.pop()
        assertEquals(5, stack.top())
    }

    @Test
    fun `should correctly return the minimum value in the stack`() {
        val stack = MinStack()

        stack.push(5)
        assertEquals(5, stack.getMin())

        stack.push(4)
        assertEquals(4, stack.getMin())

        stack.push(10)
        assertEquals(4, stack.getMin())
    }
}