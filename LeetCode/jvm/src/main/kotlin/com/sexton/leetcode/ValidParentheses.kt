package com.sexton.leetcode

import java.util.*

object ValidParentheses {
    private val BRACE_MAPPER = mapOf(
        ')' to '(',
        '}' to '{',
        ']' to '['
    )

    fun isValid(str: String): Boolean {
        if (str.isEmpty()) {
            return true
        }

        val stack = Stack<Char>()
        for (character in str) {
            if (character == '(' || character == '{' || character == '[') {
                stack.push(character)
            } else if (character == ')' || character == '}' || character == ']') {
                if (stack.isEmpty()) {
                    return false
                }

                val popped = stack.pop()
                val openingEquivalent = BRACE_MAPPER.getOrDefault(character, '0')
                if (openingEquivalent != popped) {
                    return false
                }
            }
        }

        return stack.isEmpty()
    }
}