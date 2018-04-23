import kotlin.coroutines.experimental.buildSequence

fun main(args: Array<String>) {
    // Takes roughly 5 seconds to execute compiled byte code.
    val frequencyMap = kolakoskiSequence().take(10000000).groupBy { x -> x }.toMap()
    println("${frequencyMap[1]?.size} : ${frequencyMap[2]?.size}")
}

fun kolakoskiSequence() = buildSequence {
    var iteration = 0
    val previous = mutableListOf<Int>()

    while (true) {
        val element = previous.getOrElse(iteration, { iteration + 1 })
        val digit = if (iteration % 2 == 0) 1 else 2
        for (i in 0 until element) {
            yield(digit)
            previous.add(digit)
        }
        iteration++
    }
}
