import kotlin.math.floor

object KeepHydrated {
    private const val drinkRate = 0.5

    fun litres(time: Double): Int = floor(time * drinkRate).toInt()
}
