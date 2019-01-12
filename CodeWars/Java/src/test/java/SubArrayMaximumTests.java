import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubArrayMaximumTests {
    @Test
    @DisplayName("Should return the index at which the sub array of the largest summed elements ends.")
    public void testSequence() {
        assertEquals(0, SubArrayMaximum.sequence(new int[]{}));
        assertEquals(6, SubArrayMaximum.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
