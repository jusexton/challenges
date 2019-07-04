package com.sexton.leetcode

import java.util.*

class MinStack {
    private val stack = Stack<Int>()

    fun push(x: Int): Int = stack.push(x)

    fun pop(): Int = stack.pop()

    fun top(): Int = stack.peek()

    fun getMin(): Int = stack.min() ?: throw IllegalArgumentException("No minimum value exists")
}
