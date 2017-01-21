/**
 */

println(reverseString("Hello"))

static reverseString(final String s) {
    return new StringBuilder(s).reverse().toString()
}
