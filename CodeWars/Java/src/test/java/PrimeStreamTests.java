import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PrimeStreamTests {
    @Test
    @DisplayName("")
    public void testPrimeStream() {
        testPrimeStreamHelper(0, 10, new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29});
        testPrimeStreamHelper(10, 10, new int[]{31, 37, 41, 43, 47, 53, 59, 61, 67, 71});
        testPrimeStreamHelper(100, 10, new int[]{547, 557, 563, 569, 571, 577, 587, 593, 599, 601});
        testPrimeStreamHelper(1000, 10, new int[]{7927, 7933, 7937, 7949, 7951, 7963, 7993, 8009, 8011, 8017});
    }

    /**
     * Helper for testing the PrimeStream stream method.
     * @param skip The number of elements to skip
     * @param limit The number of elements to take from the stream
     * @param expect What to expect from the method
     */
    private void testPrimeStreamHelper(int skip, int limit, int[] expect) {
        int[] found = PrimeStream.stream().skip(skip).limit(limit).toArray();
        assertArrayEquals(expect, found);
    }
}
