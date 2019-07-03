package com.sexton.leetcode

object TwoSum {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        if (numbers.size < 2) {
            throw IllegalArgumentException("Given inputs do not have a solution")
        }

        val result = intArrayOf(0, 0)
        val indicesMap = mutableMapOf<Int, Int>()
        for (k in numbers.indices) {
            if (!indicesMap.containsKey(numbers[k])) {
                indicesMap[numbers[k]] = k
            } else if (numbers[k] * 2 == target) {
                result[0] = indicesMap[numbers[k]] ?: throw NullPointerException("Something terribly wrong happened")
                result[1] = k
                return result
            }
        }

        var left = 0
        var right = numbers.size - 1
        val sortedNumbers = numbers.sorted()
        while (left < right) {
            val sum = sortedNumbers[left] + sortedNumbers[right]
            when {
                sum > target -> right--
                sum < target -> left++
                sum == target -> {
                    result[0] = indicesMap[sortedNumbers[left]]
                        ?: throw NullPointerException("Something terribly wrong happened")
                    result[1] = indicesMap[sortedNumbers[right]]
                        ?: throw NullPointerException("Something terribly wrong happened")
                    return result.sortedArray()
                }
            }
        }

        throw IllegalArgumentException("Given inputs do not have a solution")
    }
}