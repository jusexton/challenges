import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource

@DisplayName("Backwards Prime Tests")
internal class BackwardsPrimesTests {
    @DisplayName("Should display if a number is prime or not")
    @ParameterizedTest(name = "{0} is prime: {1}")
    @ArgumentsSource(PrimesTestArgumentsProvider::class)
    fun shouldReturnWhetherNumberIsPrimeOrNot(input: Long, expected: Boolean) {
        assertEquals(expected, input.isPrime())
    }

    @DisplayName("Should display whether a number is a backwards prime or not.")
    @ParameterizedTest(name = "{0} is backwards prime: {1}")
    @ArgumentsSource(BackwardsPrimesTestArgumentsProvider::class)
    fun shouldDisplayWhetherANumberIsABackwardPrimeOrNot(input: Long, expected: Boolean) {
        assertEquals(expected, input.isBackwardsPrime())
    }

    @DisplayName("Should generate all backwards primes in a given range")
    @ParameterizedTest(name = "{0} and {1} should yield {2}")
    @ArgumentsSource(BackwardsPrimeGenerationTestsArgumentProvider::class)
    fun shouldGenerateAllBackwardsPrimesInAGivenRange(start: Long, end: Long, expected: String) {
        assertEquals(expected, backwardsPrimes(start, end))
    }
}