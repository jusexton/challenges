import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizeVowelsTests {
    @Test
    public void testCapitalizeVowels() {
        assertEquals("", CapitalizeVowels.capitalize(""));
        assertEquals("HEllOWOrld!", CapitalizeVowels.capitalize("HelloWorld!"));
        assertEquals("SUndAy", CapitalizeVowels.capitalize("Sunday"));
    }
}
