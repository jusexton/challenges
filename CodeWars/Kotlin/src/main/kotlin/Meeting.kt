object Meeting {
    fun meeting(s: String): String {
        return parse(s).sortedWith(compareBy<Person> { it.lastName }.thenBy { it.firstName }).joinToString("")
    }

    private fun parse(s: String): List<Person> = s.split(";").map {

        val names = it.split(":")
        Person(names[0], names[1])
    }

    class Person(firstName: String, lastName: String) {
        val firstName = firstName.toUpperCase()
        val lastName = lastName.toUpperCase()

        override fun toString() = "($lastName, $firstName)"
    }
}