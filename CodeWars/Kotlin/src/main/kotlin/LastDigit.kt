import java.math.BigInteger

fun lastDigit(base: BigInteger, exponent: BigInteger) =
        base.modPow(exponent, BigInteger.TEN).toInt()
