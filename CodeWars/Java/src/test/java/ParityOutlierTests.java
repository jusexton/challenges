import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Parity Outlier Tests")
public class ParityOutlierTests {
    @Test
    @DisplayName("Should return the even of odd outlier in a given list of numbers")
    public void testFind() {
        assertEquals(3, ParityOutlier.find(new int[]{2, 6, 8, -10, 3}));
        assertEquals(206847684, ParityOutlier.find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
        assertEquals(0, ParityOutlier.find(new int[]{Integer.MAX_VALUE, 0, 1}));
        assertEquals(44, ParityOutlier.find(new int[]{1, 1, 1, 1, 1, 44, 7, 7, 7, 7, 7, 7, 7, 7}));
        assertEquals(1, ParityOutlier.find(new int[]{2, 6, 8, 200, 700, 1, 84, 10, 4}));
        assertEquals(-3, ParityOutlier.find(new int[]{2, -6, 8, -10, -3}));
    }
}
