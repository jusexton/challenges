package com.sexton.leetcode

fun Int.isHappy(): Boolean {
    if (this <= 0) {
        return false
    }

    var current = this
    val seen = HashSet<Int>()
    while (true) {
        val sumOfSquares = current.digits().map { it * it }.sum()

        if (sumOfSquares == 1) {
            return true
        }

        if (seen.contains(sumOfSquares)) {
            return false
        }

        seen.add(sumOfSquares)
        current = sumOfSquares
    }
}

fun Int.digits(): List<Int> {
    val digits = mutableListOf<Int>()
    var current = this
    while (current > 0) {
        val digit = current % 10
        digits.add(digit)
        current /= 10
    }

    return digits.reversed()
}

