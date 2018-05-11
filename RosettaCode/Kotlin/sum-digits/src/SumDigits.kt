fun main(args: Array<String>) {
    val testNumber = 12345
    testNumber.getDigits().joinToString(", ").also { println(it) } // 1, 2, 3, 4, 5
    testNumber.sumDigits().also { println(it) } // 15
}

fun Int.getDigits(): List<Int> {
    var state = this
    val digits = mutableListOf<Int>()
    while (state != 0) {
        digits.add(state % 10)
        state /= 10
    }
    return digits.asReversed()
}

fun Int.sumDigits() = this.getDigits().sum()