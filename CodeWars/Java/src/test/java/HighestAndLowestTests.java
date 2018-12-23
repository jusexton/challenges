import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Highest and lowest tests")
public class HighestAndLowestTests {
    @ParameterizedTest
    @DisplayName("Should return the lowest and highest integer from string of numbers")
    @ArgumentsSource(HighestAndLowestTestsArgumentProvider.class)
    public void testHighAndLow(String numbers, String expected) {
        assertEquals(expected, HighestAndLowest.highAndLow(numbers));
    }

    @ParameterizedTest
    @DisplayName("Should return the lowest and highest integer from string of numbers by sorting")
    @ArgumentsSource(HighestAndLowestTestsArgumentProvider.class)
    public void testHighAndLowBySorting(String numbers, String expected) {
        assertEquals(expected, HighestAndLowest.highAndLowBySorting(numbers));
    }

    public static class HighestAndLowestTestsArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of("1 2 3 4 5", "5 1"),
                    Arguments.of("1 2 -3 4 5", "5 -3"),
                    Arguments.of("1 9 3 4 -5", "9 -5"),
                    Arguments.of("8 3 -5 42 -1 0 0 -9 4 7 4 -4", "42 -9")
            );
        }
    }
}
