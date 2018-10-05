tailrec fun thirt(n: Long): Long {
    val digits = n.digits().reversed()
    val divisions = generateDivisions().flatten().take(digits.count()).asIterable()

    val sum = digits.zip(divisions).sumBy { it.first * it.second }.toLong()
    return if (sum == n) sum else thirt(sum)
}

fun generateDivisions() = generateSequence { setOf(1, 10, 9, 12, 3, 4) }