/**
 * Inspired by rosettacode.org
 * http://rosettacode.org/wiki/Greatest_common_divisor
 */

println(greatestCommonDivisor(255, 1255))
// println(GCD(5, 15))

static long greatestCommonDivisor(final long valueOne, final long valueTwo) {
    for (long max = Math.min(valueOne, valueTwo); max > 1; max--) {
        if (valueOne % max == 0L && valueTwo % max == 0L) {
            return max
        }
    }
    return -1
}

// Java 8 Stream API attempt.
// Gets the job done, just sloppy and probably a few bugs.
//
//static long GCD(final long valueOne, final long valueTwo){
//    long max = Math.min(valueOne, valueTwo)
//    LongStream.generate {max--}
//            .limit(max)
//            .filter { it -> valueOne % it == 0L && valueTwo % it == 0L}
//            .findFirst()
//            .orElse(-1)
//}
