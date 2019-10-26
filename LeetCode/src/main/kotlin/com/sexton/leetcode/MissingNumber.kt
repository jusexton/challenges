package com.sexton.leetcode

object MissingNumber {
    fun missingNumber(numbers: IntArray): Int {
        val numberCount = numbers.size
        val expectedSum = numberCount * (numberCount + 1) / 2
        val actualSum = numbers.sum()
        return expectedSum - actualSum
    }
}
