fun main(args: Array<String>) {
    val values = listOf(1, 2, 3, 2, 3, 4, 5, 2, 1)

    println("Distinct Result:  ${values.distinct().joinToString(", ")}")
    println("Set Result:  ${setOf(*values.toTypedArray()).joinToString(", ")}")

    val people = listOf(Person("Foo", "Bar"), Person("First", "Last"), Person("First", "Last"))
    println("Distinct Result: ${people.distinct().joinToString(", ")}")
}

data class Person(val firstName: String, val lastName: String)