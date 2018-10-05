import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

@DisplayName("Backwards Prime Tests")
internal class BackwardsPrimesTests {
    @DisplayName("Should display whether a number is a backwards prime or not.")
    @ParameterizedTest(name = "{0} is backwards prime: {1}")
    @ArgumentsSource(BackwardsPrimesTestArgumentsProvider::class)
    fun shouldDisplayWhetherANumberIsABackwardPrimeOrNot(input: Long, expected: Boolean) {
        assertEquals(expected, input.isBackwardsPrime())
    }

    internal class BackwardsPrimesTestArgumentsProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
                Arguments.of(2, false),
                Arguments.of(5, false),
                Arguments.of(11, false),
                Arguments.of(13, true),
                Arguments.of(31, true),
                Arguments.of(17, true),
                Arguments.of(71, true),
                Arguments.of(15, false),
                Arguments.of(12, false),
                Arguments.of(90, false)
        )
    }

    @DisplayName("Should generate all backwards primes in a given range")
    @ParameterizedTest(name = "{0} and {1} should yield {2}")
    @ArgumentsSource(BackwardsPrimeGenerationTestsArgumentProvider::class)
    fun shouldGenerateAllBackwardsPrimesInAGivenRange(start: Long, end: Long, expected: String) {
        assertEquals(expected, backwardsPrimes(start, end))
    }

    internal class BackwardsPrimeGenerationTestsArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
                Arguments.of(2, 100, longArrayOf(13, 17, 31, 37, 71, 73, 79, 97).joinToString(" "))
        )
    }
}