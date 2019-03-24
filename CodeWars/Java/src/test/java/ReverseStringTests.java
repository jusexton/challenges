import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTests {
    @Test
    public void testReverseString() {
        assertEquals("", ReverseString.reverseString(""));
        assertEquals("tset", ReverseString.reverseString("test"));
    }
}
