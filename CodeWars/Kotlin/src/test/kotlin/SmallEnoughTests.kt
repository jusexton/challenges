import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

@DisplayName("Small Enough Tests")
class SmallEnoughTests {
    @DisplayName("Should display if a given set of numbers are all less than or equal to a given limit")
    @ParameterizedTest(name = "{0} is prime: {1}")
    @ArgumentsSource(SmallEnoughTestsArgumentsProvider::class)
    fun shouldReturnWhetherNumberIsPrimeOrNot(numbers: IntArray, limit: Int, expected: Boolean) {
        assertEquals(expected, smallEnough(numbers, limit))
    }

    internal class SmallEnoughTestsArgumentsProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
                Arguments.of(intArrayOf(66, 101), 200, true),
                Arguments.of(intArrayOf(78, 117, 110, 99, 104, 117, 107, 115), 100, false),
                Arguments.of(intArrayOf(101, 45, 75, 105, 99, 107), 107, true)
        )
    }
}