import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Your Order Tests")
public class YourOrderTests {
    @DisplayName("Should return the correctly ordered string by the numbers they contain")
    @ParameterizedTest(name = "{0} should be {1}")
    @ArgumentsSource(YourOrderTests.YourOrderTestsArgumentProvider.class)
    public void shouldReturnTheCorrectlyOrderedStringsByTheNumbersTheyContain(String input, String expected) {
        assertEquals(expected, YourOrder.order(input));
    }

    @Test
    public void shouldReturnEmptyStringWhenGivenEmptyString() {
        final String emptyString = "";
        assertEquals(emptyString, YourOrder.order(emptyString));
    }

    public static class YourOrderTestsArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of("is2 Thi1s T4est 3a", "Thi1s is2 3a T4est")
            );
        }
    }
}
