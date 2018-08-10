fun main(args: Array<String>) {
    println(longestWord("This is a test sentence!"))
}

fun longestWord(sentence: String): String {
    if (sentence == "") {
        throw IllegalArgumentException("Sentence cannot be empty an string.")
    }

    val words = Regex("[^a-zA-Z ]").replace(sentence, "").split(' ').toSortedSet()

    // First word is assumed to be the largest word.
    var largestWord = words.first()
    // Skip the first word when comparing through the rest.
    for (index in 1 until words.size) {
        if (words.elementAt(index).length > largestWord.length) {
            largestWord = words.elementAt(index)
        }
    }
    return largestWord
}
