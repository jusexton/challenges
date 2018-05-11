val testNumbers = listOf(5, 6, 4, 3, 4, 3)

fun main(args: Array<String>) {
    println(testNumbers.sum()) // sum
    println(testNumbers.product()) // product
}

fun Iterable<Int>.product() = this.reduce { acc, i -> i * acc }