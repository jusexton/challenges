package com.sexton.leetcode

object AddDigits {
    fun addDigits(number: Int): Int = if (number == 0) 0 else (if (number % 9 == 0) 9 else (number % 9))
}
