import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Find the odd int tests")
public class FindTheOddIntTests {
    @DisplayName("Should return the int that occurs an odd number of times")
    @ParameterizedTest(name = "{1} occurs odd number of times.")
    @ArgumentsSource(FindTheOddIntTestArgumentProvider.class)
    public void shouldReturnTheIntThatOccursAnOddNumberOfTimes(int[] numbers, int expected) {
        assertEquals(expected, FindTheOddInt.find(numbers));
    }
}
