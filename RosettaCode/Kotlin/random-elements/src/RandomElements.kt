import java.util.*
import kotlin.streams.toList

fun main(args: Array<String>) {
    val randomNumbers = (1..100).toList()
            .getRandomElements(10)
            .joinToString(", ")
    println("Randomly selected numbers are: $randomNumbers")
}

fun <T> Collection<T>.getRandomElements(randomElementCount: Long): List<T> =
        Random().ints(0, this.size)
                .limit(randomElementCount)
                .mapToObj { it -> this.elementAt(it) }
                .toList()

