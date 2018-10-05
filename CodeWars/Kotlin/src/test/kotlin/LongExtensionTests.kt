import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

@DisplayName("Long Extension Tests")
class LongExtensionTests {
    @DisplayName("Should display if a number is prime or not")
    @ParameterizedTest(name = "{0} is prime: {1}")
    @ArgumentsSource(PrimesTestArgumentsProvider::class)
    fun shouldReturnWhetherNumberIsPrimeOrNot(input: Long, expected: Boolean) {
        Assertions.assertEquals(expected, input.isPrime())
    }

    internal class PrimesTestArgumentsProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
                Arguments.of(0L, false),
                Arguments.of(1L, false),
                Arguments.of(2L, true),
                Arguments.of(3L, true),
                Arguments.of(4L, false),
                Arguments.of(5L, true),
                Arguments.of(11L, true),
                Arguments.of(100L, false),
                Arguments.of(1009L, true),
                Arguments.of(1373L, true),
                Arguments.of(1931L, true),
                Arguments.of(1472L, false)
        )
    }

    @DisplayName("Should return all digits of a given integer input")
    @ParameterizedTest(name = "{0} has the digits {1}")
    @ArgumentsSource(DigitsTestArgumentProvider::class)
    fun shouldReturnAllDigitsOfAGivenIntegerInput(input: Long, expectedDigits: Iterable<Int>) {
        assertEquals(expectedDigits, input.digits())
    }

    internal class DigitsTestArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
                Arguments.of(1, listOf(1).asIterable()),
                Arguments.of(12, listOf(1, 2).asIterable()),
                Arguments.of(123, listOf(1, 2, 3).asIterable()),
                Arguments.of(0, listOf(0).asIterable()),
                Arguments.of(840285, listOf(8, 4, 0, 2, 8, 5).asIterable())
        )
    }
}