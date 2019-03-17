import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfNumbersTests {
    @Test
    public void testWhenValueIsZero() {
        assertEquals("", NumberOfNumbers.numberOfNumbers(0));

    }

    @Test
    public void testPositiveValues() {
        assertEquals("1", NumberOfNumbers.numberOfNumbers(1));
        assertEquals("1-22", NumberOfNumbers.numberOfNumbers(2));
        assertEquals("1-22-333", NumberOfNumbers.numberOfNumbers(3));
        assertEquals("1-22-333-4444", NumberOfNumbers.numberOfNumbers(4));
        assertEquals("1-22-333-4444-55555", NumberOfNumbers.numberOfNumbers(5));
    }

    @Test
    public void testNegativeValues() {
        assertEquals("1", NumberOfNumbers.numberOfNumbers(-1));
        assertEquals("1+22", NumberOfNumbers.numberOfNumbers(-2));
        assertEquals("1+22+333", NumberOfNumbers.numberOfNumbers(-3));
        assertEquals("1+22+333+4444", NumberOfNumbers.numberOfNumbers(-4));
        assertEquals("1+22+333+4444+55555", NumberOfNumbers.numberOfNumbers(-5));
    }

    @Test
    public void testWithDoubleDigits() {
        assertEquals("1-22-333-4444-55555-666666-7777777-88888888-999999999-10101010101010101010", NumberOfNumbers.numberOfNumbers(10));
    }
}
