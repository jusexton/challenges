import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringEndsWithTests {
    @Test
    @DisplayName("Should return true when a given suffix is at the end of a given string.")
    public void testStringEndWithMethodTrueResults() {
        assertTrue(StringEndsWith.endsWith("", ""));
        assertTrue(StringEndsWith.endsWith("abc", ""));
        assertTrue(StringEndsWith.endsWith("abc", "c"));
        assertTrue(StringEndsWith.endsWith("abcd", "cd"));
        assertTrue(StringEndsWith.endsWith("abc", "abc"));
    }

    @Test
    @DisplayName("Should return false when a given suffix is notr at the end of a given string.")
    public void testStringEndWithMethodFalseResults() {
        assertFalse(StringEndsWith.endsWith("a", "ab"));
        assertFalse(StringEndsWith.endsWith("hello", "ab"));
        assertFalse(StringEndsWith.endsWith("there", "ab"));
    }
}
