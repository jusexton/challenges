import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleColaTests {
    private static final String[] TEST_NAMES = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};

    @Test
    @DisplayName("Should return who is nth is line if every time a name drinks the two return to back of the line.")
    public void testWhoIsNext() {
        assertEquals("Sheldon", DoubleCola.whoIsNext(TEST_NAMES, 1));
        assertEquals("Sheldon", DoubleCola.whoIsNext(TEST_NAMES, 6));
        assertEquals("Penny", DoubleCola.whoIsNext(TEST_NAMES, 52));
        assertEquals("Leonard", DoubleCola.whoIsNext(TEST_NAMES, 7230702951L));
    }
}
