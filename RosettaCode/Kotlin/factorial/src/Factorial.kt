fun main(args: Array<String>) {
    println(factorial(5)) // 120
}

fun factorial(n: Int): Long = when {
    n < 0 -> throw IllegalArgumentException("negative numbers not allowed")
    n < 2 -> 1L
    else -> n * factorial(n - 1)
}