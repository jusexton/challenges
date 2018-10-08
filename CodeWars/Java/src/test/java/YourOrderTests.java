import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Your Order Tests")
public class YourOrderTests {
    @DisplayName("Should return the correctly ordered string by the numbers they contain")
    @ParameterizedTest(name = "{0} should be {1}")
    @ArgumentsSource(YourOrderTestsArgumentProvider.class)
    public void shouldReturnTheCorrectlyOrderedStringsByTheNumbersTheyContain(String input, String expected) {
        assertEquals(expected, YourOrder.order(input));
    }
}
