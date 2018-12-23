import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryDivisibleByFiveTests {
    @Test
    @DisplayName("Should return pattern that matches with binary strings divisible by five.")
    public void testDivisibleByFivePatternWithTrueValues() {
        assertTrue(BinaryDivisibleByFive.pattern().matcher("101").matches());
        assertTrue(BinaryDivisibleByFive.pattern().matcher("10000111").matches());
    }

    @Test
    @DisplayName("Should return pattern that does not match with binary strings not divisible by five.")
    public void testDivisibleByFivePatternWithFalseValues() {
        assertFalse(BinaryDivisibleByFive.pattern().matcher("").matches());
        assertFalse(BinaryDivisibleByFive.pattern().matcher("0000001010011010").matches());
    }
}
