import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource

@DisplayName("Hide Password Tests")
internal class HidePasswordTests {
    @DisplayName("Should return the given string with its password field hidden")
    @ParameterizedTest(name = "{0} should be {1}")
    @ArgumentsSource(HidePasswordTestsArgumentsProvider::class)
    fun shouldReturnTheGivenStringWithItsPasswordFieldHidden(input: String, expected: String) {
        assertEquals(expected, hidePassword(input))
    }
}