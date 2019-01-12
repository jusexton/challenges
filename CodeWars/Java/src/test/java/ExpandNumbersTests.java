import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpandNumbersTests {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", ExpandNumbers.expand(12));
        assertEquals("40 + 2", ExpandNumbers.expand(42));
        assertEquals("70000 + 300 + 4", ExpandNumbers.expand(70304));
    }
}
