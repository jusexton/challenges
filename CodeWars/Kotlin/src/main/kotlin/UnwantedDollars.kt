object UnwantedDollars {
    fun moneyValue(money: String): Double {
        val moneyWithoutWhitespace = money.removeAllWhiteSpace()
        return moneyWithoutWhitespace.replace("\\$".toRegex(), "")
                .toDoubleOrNull() ?: 0.0
    }
}

fun String.removeAllWhiteSpace() = this.replace("\\s".toRegex(), "")