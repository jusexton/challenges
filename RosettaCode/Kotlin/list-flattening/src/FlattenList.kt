fun main(args: Array<String>) {
    val nestedLists = listOf(
            listOf(1),
            2,
            listOf(listOf(3, 4), 5),
            listOf(listOf(emptyList<Int>())),
            listOf(listOf(listOf(6))),
            7, 8,
            emptyList<Int>()
    )

    println(nestedLists.flatten())
}

fun Iterable<Any>.flatten(): Iterable<Any?> = flattenToIterable(this)

private fun flattenToIterable(iterable: Iterable<Any?>): Iterable<Any?> =
        iterable.flatMap { if (it is Iterable<*>) flattenToIterable(it.asIterable()) else listOf(it).asIterable() }
