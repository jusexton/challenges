import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Duplicate Encoder Tests")
public class DuplicateEncoderTests {
    @Test
    @DisplayName("Should decode a string using open and closed parentheses depending on character uniqueness.")
    public void testEncode() {
        assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
    }
}
