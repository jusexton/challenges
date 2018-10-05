import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource

@DisplayName("Blue Beads Tests")
internal class BlueBeadsTests {
    @DisplayName("Should display the correct amount of red beads")
    @ParameterizedTest(name = "{0} blue beads -> {1} red beads")
    @ArgumentsSource(BlueBeadsTestsArgumentsProvider::class)
    fun shouldReturnTheCorrectAmountOfRedBeads(blueBeadCount: Int, expected: Int) {
        Assertions.assertEquals(expected, countRedBeads(blueBeadCount))
    }
}