import TheOffice.NEGATIVE_MESSAGE
import TheOffice.POSITIVE_MESSAGE
import TheOffice.outed
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

@DisplayName("The Office Tests")
internal class TheOfficeTests {
    @ParameterizedTest
    @ArgumentsSource(PositiveHappinessArgumentProvider::class)
    fun `should return positive message when happiness is above 5`(meet: Map<String, Int>, boss: String) {
        assertEquals(POSITIVE_MESSAGE, outed(meet, boss))
    }

    @ParameterizedTest
    @ArgumentsSource(NegativeHappinessArgumentProvider::class)
    fun `should return negative message when happiness is 5 or below`(meet: Map<String, Int>, boss: String) {
        assertEquals(NEGATIVE_MESSAGE, outed(meet, boss))
    }

    internal class PositiveHappinessArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
                Arguments.of(mapOf("tim" to 1, "jim" to 3, "randy" to 9, "sandy" to 6, "andy" to 7, "katie" to 6, "laura" to 9, "saajid" to 9, "alex" to 9, "john" to 9, "mr" to 8), "katie"),
                Arguments.of(mapOf("tim" to 7, "jim" to 4, "timmy" to 4), "tim"),
                Arguments.of(mapOf("tim" to 8, "jim" to 1, "randy" to 8, "sandy" to 6, "andy" to 8, "katie" to 4, "laura" to 4, "saajid" to 0, "alex" to 8, "john" to 3, "mr" to 3), "laura")
        )
    }

    internal class NegativeHappinessArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
                Arguments.of(mapOf("tim" to 0, "jim" to 2, "randy" to 0, "sandy" to 7, "andy" to 0, "katie" to 5, "laura" to 1, "saajid" to 2, "alex" to 3, "john" to 2, "mr" to 0), "laura"),
                Arguments.of(mapOf("tim" to 2, "jim" to 4, "randy" to 0, "sandy" to 5, "andy" to 8, "katie" to 6, "laura" to 2, "saajid" to 2, "alex" to 3, "john" to 2, "mr" to 8), "john")
        )
    }
}
