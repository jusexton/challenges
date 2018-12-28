import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TribonacciSequenceTests {
    private TribonacciSequence tribonacciSequence;

    @BeforeEach
    public void setUp() {
        tribonacciSequence = new TribonacciSequence();
    }

    @Test
    public void testTribonacciSequence() {
        double precision = 1e-10;
        assertArrayEquals(new double[]{16, 15}, tribonacciSequence.tribonacci(new double[]{16, 15, 16}, 2), precision);
        assertArrayEquals(new double[]{1, 1, 1, 3, 5, 9, 17, 31, 57, 105}, tribonacciSequence.tribonacci(new double[]{1, 1, 1}, 10), precision);
        assertArrayEquals(new double[]{0, 0, 1, 1, 2, 4, 7, 13, 24, 44}, tribonacciSequence.tribonacci(new double[]{0, 0, 1}, 10), precision);
        assertArrayEquals(new double[]{0, 1, 1, 2, 4, 7, 13, 24, 44, 81}, tribonacciSequence.tribonacci(new double[]{0, 1, 1}, 10), precision);
    }
}
