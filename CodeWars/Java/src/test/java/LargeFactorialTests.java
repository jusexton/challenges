import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Large Factorial Tests")
public class LargeFactorialTests {
    @Test
    @DisplayName("Should return the factorial of given number in string form")
    public void testFactorial() {
        assertEquals("1", LargeFactorial.factorial(1));
        assertEquals("120", LargeFactorial.factorial(5));
        assertEquals("362880", LargeFactorial.factorial(9));
        assertEquals("1307674368000", LargeFactorial.factorial(15));
    }
}
