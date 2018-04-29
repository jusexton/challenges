import java.math.BigInteger

fun BigInteger.getDigits(): List<Int> {
    var intState = this
    val digits = mutableListOf<Int>()

    do {
        digits.add(intState.rem(BigInteger.TEN).toInt())
        intState = intState.div(BigInteger.TEN)
    } while (intState.compareTo(BigInteger.ZERO) != 0)

    return digits
}

fun BigInteger.isHappy(): Boolean {
    val cache = mutableListOf<BigInteger>()
    var intState = this
    while (intState.compareTo(BigInteger.ONE) != 0) {
        if (cache.contains(intState)) {
            return false
        }

        cache.add(intState)
        intState = intState.getDigits()
                .map { it.times(it) }
                .sum()
                .toBigInteger()
    }
    return true
}