fun main(args: Array<String>) {
    println("the three truths".occurrences("th")) // 3
}

fun String.occurrences(suffix: String) = Regex(suffix).findAll(this).count()
