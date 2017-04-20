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
