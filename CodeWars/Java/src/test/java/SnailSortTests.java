import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SnailSortTests {
    @Test
    @DisplayName("Should return the snail sorted array of a given nxn matrix")
    public void testSnailSort() {
        assertArrayEquals(new int[]{1}, SnailSort.sort(new int[][]{
                new int[]{1}
        }));

        assertArrayEquals(new int[]{}, SnailSort.sort(new int[][]{
                new int[]{}
        }));

        assertArrayEquals(new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5}, SnailSort.sort(new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9}
        }));

        assertArrayEquals(new int[]{1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10}, SnailSort.sort(new int[][]{
                new int[]{1, 2, 3, 4},
                new int[]{5, 6, 7, 8},
                new int[]{9, 10, 11, 12},
                new int[]{13, 14, 15, 16}
        }));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNumberIsNull() {
        assertThrows(IllegalArgumentException.class, () -> SnailSort.sort(null));
    }

    @Test
    public void shouldReturnEmptyArrayWhenGivenNumbersAreEmpty() {
        final int[] result = SnailSort.sort(new int[][]{});
        assertEquals(0, result.length);
    }
}
