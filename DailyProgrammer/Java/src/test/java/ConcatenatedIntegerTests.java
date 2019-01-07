import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public final class ConcatenatedIntegerTests {
    @Test
    public void testCollectMinAndMaxPermutations() {
        final Integer[] testNumbers = {420, 34, 19, 71, 341};
        final Long[] expected = new Long[]{193413442071L, 714203434119L};
        final Long[] actual = ConcatenatedIntegers.collectMinAndMax(testNumbers);
        assertArrayEquals(expected, actual);
    }
}
