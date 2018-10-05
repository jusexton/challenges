import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

@DisplayName("Hide Password Tests")
internal class HidePasswordTests {
    @DisplayName("Should return the given string with its password field hidden")
    @ParameterizedTest(name = "{0} should be {1}")
    @ArgumentsSource(HidePasswordTestsArgumentsProvider::class)
    fun shouldReturnTheGivenStringWithItsPasswordFieldHidden(input: String, expected: String) {
        assertEquals(expected, hidePassword(input))
    }

    internal class HidePasswordTestsArgumentsProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
                Arguments.of(
                        "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345",
                        "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****"
                ),
                Arguments.of(
                        "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=password",
                        "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=********"
                ),
                Arguments.of(
                        "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?password=password&user=root",
                        "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?password=********&user=root"
                )
        )
    }
}