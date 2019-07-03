package com.sexton.leetcode

object PalindromeNumber {
    fun isPalindrome(number: Int): Boolean {
        if (number < 0) {
            return false
        }

        val numberString = number.toString()
        return numberString.reversed() == numberString
    }
}