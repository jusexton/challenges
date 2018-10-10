import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

@DisplayName("Camel Case Tests")
internal class CamelCaseTests {
    @DisplayName("Should correctly convert a given string to its camel case form")
    @ParameterizedTest(name = "{0} should be convert to {1}")
    @ArgumentsSource(CamelCaseTestArgumentsProvider::class)
    fun shouldCorrectlyConvertGivenStringToItsCamelCaseForm(input: String, expected: String) {
        Assertions.assertEquals(expected, toCamelCase(input))
    }

    internal class CamelCaseTestArgumentsProvider : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> = Stream.of(
                Arguments.of("the-stealth-warrior", "theStealthWarrior"),
                Arguments.of("The_Stealth_Warrior", "TheStealthWarrior"),
                Arguments.of("A-B-C", "ABC")
        )
    }
}