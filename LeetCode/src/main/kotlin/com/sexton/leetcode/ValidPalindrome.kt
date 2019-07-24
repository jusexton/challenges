package com.sexton.leetcode

object ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        val formattedString = s.replace("[^a-z0-9]".toRegex(RegexOption.IGNORE_CASE), "").toLowerCase()
        return formattedString.reversed() == formattedString
    }
}