import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FibonacciStreamTests {
    @Test
    public void testFibonacciStream() {
        final int [] expected = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        final int[] actual = FibonacciStream.generate(0, 1).limit(10).toArray();
        assertArrayEquals(expected, actual);
    }
}
