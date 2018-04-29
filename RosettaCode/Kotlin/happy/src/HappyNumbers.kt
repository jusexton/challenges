import java.math.BigInteger
import kotlin.coroutines.experimental.buildSequence

fun main(args: Array<String>) {
    happyNumbers().take(100).forEach { println(it) }
}

fun happyNumbers(start: Long) = happyNumbers(start.toBigInteger())

fun happyNumbers(start: Int) = happyNumbers(start.toBigInteger())

fun happyNumbers(start: BigInteger = BigInteger.ONE) = buildSequence {
    if (start < BigInteger.ZERO) throw IllegalArgumentException("Start must be positive")

    var intState = start
    while (true) {
        if (intState.isHappy()) yield(intState)
        intState = intState.plus(BigInteger.ONE)
    }
}
