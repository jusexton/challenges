package com.sexton.leetcode

object FactorialTrailingZeroes {
    // fun trailingZeroes(n: Int): Int = n.factorial().toString().takeLastWhile { it == '0' }.count()

    //    fun trailingZeroes(n: Int): Int {
    //        var count = 0
    //        var i = 5
    //        while (n.div(i) >= 1) {
    //            count += n.div(i)
    //            i *= 5
    //        }
    //        return count
    //    }

    fun trailingZeroes(n: Int): Int = if (n == 0) 0 else n / 5 + trailingZeroes(n / 5)
}

//fun Int.factorial(): BigInteger =
//    (1..this).fold(BigInteger.ONE) { acc, element ->
//        acc.multiply(BigInteger.valueOf(element.toLong()))
//    }

