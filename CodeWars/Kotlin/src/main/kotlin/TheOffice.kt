object TheOffice {
    const val POSITIVE_MESSAGE = "Nice Work Champ!"
    const val NEGATIVE_MESSAGE = "Get Out Now!"

    fun outed(meet: Map<String, Int>, boss: String): String {
        val averageHappiness = meet
                .map {
                    if (it.key == boss) (it.value * 2) else it.value
                }.average()

        return if (averageHappiness <= 5.0) NEGATIVE_MESSAGE else POSITIVE_MESSAGE
    }
}
