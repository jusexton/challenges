import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidBracesTests {
    @Test
    public void testValidBraces() {
        assertTrue(ValidBraces.isValid("()"));
        assertTrue(ValidBraces.isValid("(())"));
        assertTrue(ValidBraces.isValid("[([])()[]{([])()}]"));
    }

    @Test
    public void testInvalidBraces() {
        assertFalse(ValidBraces.isValid("[(])"));
    }
}
