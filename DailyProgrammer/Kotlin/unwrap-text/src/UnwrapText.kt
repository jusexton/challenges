import java.io.File

fun main(args: Array<String>) {
    val result = unwrapText(File("test-data.txt").readText())
    println(result)
}

fun unwrapText(content: String): String {
    val punctuation = arrayOf(".", "?", "!")
    val lines = Regex("\n").split(content).toMutableList()
    for (i in 0 until lines.size) {
        if (lines[i].endsWith(*punctuation))
            lines.add(i + 1, "")
    }
    return lines.joinToString("\n")
}

fun String.endsWith(vararg suffixes: String, ignoreCase: Boolean = false): Boolean =
        suffixes.any { it -> this.endsWith(it, ignoreCase) }
