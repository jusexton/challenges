val TEST_LIST = listOf(-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20)

fun main(args: Array<String>) {
    val compressString = TEST_LIST.compressToRange(", ")
    println(compressString)

    println(expandRange(compressString).joinToString(", "))
}

fun expandRange(range: String): List<Int> {
    val list = mutableListOf<Int>()
    val values = range.split(",").map { it.trim() }
    val regex = Regex("(-?\\d+)-(-?\\d+)")
    for (value in values) {
        if (regex.matches(value)) {
            // Force not null because the match is checked within if statement.
            // Possible better way of doing this?
            val groupValues = regex.matchEntire(value)!!.groupValues
            for (i in groupValues[1].toInt()..groupValues[2].toInt()) list.add(i)
        } else {
            list.add(value.toInt())
        }
    }
    return list
}

fun List<Int>.compressToRange(delimiter: String = ", "): String {
    val sb = StringBuilder()
    var previous = this[0]
    var start = previous
    for (next in this.subList(1, this.size)) {
        if (previous + 1 != next) {
            sb.appendRange(start, previous, delimiter)
            sb.append(delimiter)
            start = next
        }
        previous = next
    }
    sb.appendRange(start, previous, delimiter)
    return sb.toString()
}

fun StringBuilder.appendRange(start: Int, end: Int, delimiter: String) {
    this.append(start)
    if (start != end) this.append(if (end - start > 1) "-" else delimiter).append(end)
}