import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class KeepHydratedTest {
    @ParameterizedTest
    @ArgumentsSource(KeepHydratedTestArgumentProvider::class)
    fun `should return correct number of liters the cyclist should drink`(expected: Int, miles: Double) {
        assertEquals(expected, KeepHydrated.litres(miles))
    }

    internal class KeepHydratedTestArgumentProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> =
                Stream.of(
                        Arguments.of(0, 0.0),
                        Arguments.of(1, 3.0),
                        Arguments.of(3, 6.7),
                        Arguments.of(5, 11.8),
                        Arguments.of(893, 1787.0),
                        Arguments.of(6, 12.3)
                )
    }
}
