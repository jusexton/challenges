import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.math.BigInteger
import java.util.stream.Stream

@DisplayName("Last Digit Tests")
class LastDigitTests {
    @DisplayName("Should return the last digit")
    @ParameterizedTest(name = "Last digit of {0}^{1} should be {2}")
    @ArgumentsSource(LastDigitTestArgumentsProvider::class)
    fun shouldReturnWhetherNumberIsPrimeOrNot(base: BigInteger, exponent: BigInteger, expected: Int) {
        Assertions.assertEquals(expected, lastDigit(base, exponent))
    }

    internal class LastDigitTestArgumentsProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
                Arguments.of(BigInteger("4"), BigInteger("1"), 4),
                Arguments.of(
                        BigInteger("3715290469715693021198967285016729344580685479654510946723"),
                        BigInteger("68819615221552997273737174557165657483427362207517952651"),
                        7)
        )
    }
}