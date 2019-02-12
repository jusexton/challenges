import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfNumbersTests {
    @Test
    public void testSumRangeMethod() {
        assertEquals(-1, SumOfNumbers.sumRange(0, -1));
        assertEquals(0, SumOfNumbers.sumRange(-5, 5));
        assertEquals(0, SumOfNumbers.sumRange(5, -5));
        assertEquals(15, SumOfNumbers.sumRange(0, 5));
        assertEquals(15, SumOfNumbers.sumRange(5, 0));
        assertEquals(-3, SumOfNumbers.sumRange(-2, 0));
        assertEquals(15, SumOfNumbers.sumRange(5, 1));
    }
}
