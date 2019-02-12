import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimplePigLatinTests {
    @Test
    @DisplayName("Should return the pig latin equivalent of a given string")
    public void testPigLatinMethod() {
        assertEquals("igPay atinlay siay oolcay", SimplePigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", SimplePigLatin.pigIt("This is my string"));
        assertEquals("elloHay orldway !", SimplePigLatin.pigIt("Hello world !"));
    }
}
