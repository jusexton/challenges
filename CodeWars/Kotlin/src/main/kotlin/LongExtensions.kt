fun Long.isBackwardsPrime(): Boolean {
    val longString = this.toString()
    val reversed = this.toString().reversed()
    return when {
        this <= 12 -> false
        longString == reversed -> false
        else -> this.isPrime() && reversed.toLong().isPrime()
    }
}

fun Long.isPrime(): Boolean = when {
    this == 1L -> false
    this == 2L -> true
    this % 2 == 0L -> false
    else -> {
        val boundary = Math.floor(Math.sqrt(this.toDouble())).toInt()
        (3..boundary step 2).all { it -> this % it != 0L }
    }
}