package com.sexton.leetcode

object LengthOfLastWord {
    // fun lengthOfLastWord(s: String): Int = if (s.isBlank()) 0 else (s.trimEnd().split(" ").takeLast(1).firstOrNull() ?: "").length

    fun lengthOfLastWord(s: String): Int {
        if (s.isBlank()) {
            return 0
        }

        var count = 0
        val trimmedString = s.trimEnd()
        for (i in trimmedString.length - 1 downTo 0) {
            val character = trimmedString[i]
            if (character.isWhitespace()) {
                break
            }
            count++
        }

        return count
    }
}