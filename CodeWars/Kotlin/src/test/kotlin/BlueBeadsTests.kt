import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

@DisplayName("Blue Beads Tests")
internal class BlueBeadsTests {
    @DisplayName("Should display the correct amount of red beads")
    @ParameterizedTest(name = "{0} blue beads -> {1} red beads")
    @ArgumentsSource(BlueBeadsTestsArgumentsProvider::class)
    fun shouldReturnTheCorrectAmountOfRedBeads(blueBeadCount: Int, expected: Int) {
        Assertions.assertEquals(expected, countRedBeads(blueBeadCount))
    }

    internal class BlueBeadsTestsArgumentsProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 0),
                Arguments.of(2, 2),
                Arguments.of(3, 4),
                Arguments.of(4, 6),
                Arguments.of(5, 8),
                Arguments.of(6, 10)
        )
    }
}