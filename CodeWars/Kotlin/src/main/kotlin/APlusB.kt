// Refactored
object Dinglemouse {
    fun int123(a: Int) = Integer.toUnsignedLong(123 - a)
}

//object Dinglemouse {
//    fun int123(a: Int): Long = when {
//        a > 123 -> Long.MAX_VALUE - a + 124L
//        a < 123 -> 123L - a
//        else -> 0L
//    }
//}