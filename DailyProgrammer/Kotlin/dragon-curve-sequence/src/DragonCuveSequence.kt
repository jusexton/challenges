import kotlin.coroutines.experimental.buildSequence

fun main(args: Array<String>) =
        dragonCurveSequence()
                .take(3)
                .forEach { println(it) }


fun dragonCurveSequence() = buildSequence {
    var result = "1"
    while (true) {
        yield(result)
        result = "$result${result}0"
    }
}