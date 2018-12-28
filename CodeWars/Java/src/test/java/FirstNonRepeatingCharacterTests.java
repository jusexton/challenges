import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstNonRepeatingCharacterTests {
    @Test
    @DisplayName("Should return the first non repeated character in a given string")
    public void testFind() {
        final Character expected = 'b';
        final Character actual = FirstNonRepeatedCharacter.find("birthday");
        assertEquals(expected, actual);
    }
}
