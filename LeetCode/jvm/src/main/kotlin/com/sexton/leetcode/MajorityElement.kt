package com.sexton.leetcode

object MajorityElement {
    fun majorityElement(numbers: IntArray): Int =
        // First is used instead of firstOrNull because it can be assumed that the majority element exists
        numbers.groupBy { it }.entries.first { it.value.size > (numbers.size / 2) }.key
}