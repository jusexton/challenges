import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HighestProfitTests {
    @Test
    public void testExampleCases() {
        assertArrayEquals(new int[]{1, 5}, HighestProfit.minMax(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{5, 2334454}, HighestProfit.minMax(new int[]{2334454, 5}));
        assertArrayEquals(new int[]{1, 1}, HighestProfit.minMax(new int[]{1}));
    }
}
