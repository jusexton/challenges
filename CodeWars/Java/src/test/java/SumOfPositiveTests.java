import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfPositiveTests {
    @Test
    @DisplayName("Should return the sum of only positive integers from a given list of numbers")
    public void testSumOfPositiveMethod() {
        assertEquals(15, SumOfPositive.sumOfPositive(new int[]{1, 2, 3, 4, 5}));
        assertEquals(13, SumOfPositive.sumOfPositive(new int[]{1, -2, 3, 4, 5}));
        assertEquals(0, SumOfPositive.sumOfPositive(new int[]{}));
        assertEquals(0, SumOfPositive.sumOfPositive(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(9, SumOfPositive.sumOfPositive(new int[]{-1, 2, 3, 4, -5}));
    }
}
