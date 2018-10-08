import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Isogram Tests")
public class IsogramsTests {
    @DisplayName("Should return whether given string is isogram or not")
    @ParameterizedTest(name = "{0} is isogram: {1}")
    @ArgumentsSource(IsogramTestsArgumentProvider.class)
    public void shouldReturnWhetherGivenStringIsIsogramOrNot(String value, Boolean expected) {
        assertEquals(expected, Isograms.isIsogram(value));
    }
}
