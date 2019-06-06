package com.sexton.leetcode

fun Int.reverse(): Int {
    val reversedNumberString = this.toString().trimStart { it == '-' }.reversed().trimStart { it == '0' }
    val negative = if (this < 0) "-" else ""
    return try {
        if (reversedNumberString != "") "$negative$reversedNumberString".toInt() else 0
    } catch (e: NumberFormatException) {
        0
    }
}
