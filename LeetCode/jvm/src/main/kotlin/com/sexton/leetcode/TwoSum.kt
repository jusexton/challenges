package com.sexton.leetcode

object TwoSum {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        require(numbers.size >= 2) { "Given inputs do not have a solution" }

        val complementMap = mutableMapOf<Int, Int>()
        for (index in numbers.indices) {
            val number = numbers[index]
            val complement = target - number
            if (complementMap.containsKey(complement)) {
                return intArrayOf(complementMap[complement] ?: throw IllegalStateException("Wont happen"), index)
            }

            complementMap[number] = index
        }

        throw IllegalArgumentException("Given inputs do not have a solution")
    }
}
