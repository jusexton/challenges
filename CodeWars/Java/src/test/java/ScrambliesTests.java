import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Scramblies Tests")
public class ScrambliesTests {
    @DisplayName("Should return whether a given string can be made from another given string")
    @ParameterizedTest(name = "{0} should be {1}")
    @ArgumentsSource(ScrambliesTests.ScrambliesTestsArgumentProvider.class)
    public void testScramble(String inputOne, String inputTwo, boolean expected) {
        assertEquals(expected, Scramblies.scramble(inputOne, inputTwo));
    }

    public static class ScrambliesTestsArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of("rkqodlw", "world", true),
                    Arguments.of("cedewaraaossoqqyt", "codewars", true),
                    Arguments.of("", "", true),
                    Arguments.of("katas", "steak", false),
                    Arguments.of("", "steak", false)
            );
        }
    }
}
