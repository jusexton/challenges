package com.sexton.leetcode

object Pow {
    fun pow(x: Double, n: Int): Double = Math.exp(n * Math.log(Math.abs(x)))
}