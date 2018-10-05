import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

@DisplayName("Divisibility Rule Tests")
class DivisibilityRuleTests {
    @DisplayName("Should return the correct stationary remainder from given input")
    @ParameterizedTest(name = "{0} -> {1}")
    @ArgumentsSource(DivisibilityRuleTestsArgumentsProvider::class)
    fun shouldReturnTheCorrectStationaryRemainderFromGivenInput(input: Long, expected: Long) {
        assertEquals(expected, thirt(input))
    }

    internal class DivisibilityRuleTestsArgumentsProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
                Arguments.of(1234567, 87),
                Arguments.of(321, 48)
        )
    }
}