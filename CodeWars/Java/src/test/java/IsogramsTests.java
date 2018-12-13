import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Isogram Tests")
public class IsogramsTests {
    @DisplayName("Should return whether given string is isogram or not")
    @ParameterizedTest(name = "{0} is isogram: {1}")
    @ArgumentsSource(IsogramTestsArgumentProvider.class)
    public void shouldReturnWhetherGivenStringIsIsogramOrNot(String value, Boolean expected) {
        assertEquals(expected, Isograms.isIsogram(value));
    }

    public class IsogramTestsArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of("Thumbscrewjapingly", true),
                    Arguments.of("Dermatoglyphics", true),
                    Arguments.of("moose", false),
                    Arguments.of("helLo", false),
                    Arguments.of("", true)
            );
        }
    }
}
