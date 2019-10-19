package com.sexton.leetcode

import java.util.*

object PalindromeNumber {
//    fun isPalindrome(number: Int): Boolean {
//        if (number < 0) {
//            return false
//        }
//
//        val numberString = number.toString()
//        return numberString.reversed() == numberString
//    }

    fun isPalindrome(number: Int): Boolean {
        if (number < 0) {
            return false
        }

        val digits = number.digits()
        val digitCount = digits.size - 1

        for (i in 0..(digitCount / 2)) {
            if (digits[i] != digits[digitCount - i]) {
                return false
            }
        }

        return true
    }

    fun Int.digits(): IntArray {
        var current = this
        val digits = LinkedList<Int>()
        while (current > 0) {
            val digit = current % 10
            digits.add(digit)
            current /= 10
        }
        return digits.reversed().toIntArray()
    }
}