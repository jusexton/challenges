import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PinValidatorTests {
    @Test
    @DisplayName("Should return true when given a string of length 4 or 6 containing digits 0-9")
    public void testValidPins() {
        assertTrue(PinValidator.validatePin("1234"));
        assertTrue(PinValidator.validatePin("0000"));
        assertTrue(PinValidator.validatePin("1111"));
        assertTrue(PinValidator.validatePin("123456"));
        assertTrue(PinValidator.validatePin("098765"));
        assertTrue(PinValidator.validatePin("000000"));
        assertTrue(PinValidator.validatePin("090909"));
    }

    @Test
    @DisplayName("Should return false when given characters that are not digits")
    public void testNonDigitCharacters() {
        assertFalse(PinValidator.validatePin("a234"));
        assertFalse(PinValidator.validatePin(".234"));
    }

    @Test
    @DisplayName("Should return false when given string not of length 4 or 6")
    public void testInvalidLengthPins() {
        assertFalse(PinValidator.validatePin("1"));
        assertFalse(PinValidator.validatePin("12"));
        assertFalse(PinValidator.validatePin("123"));
        assertFalse(PinValidator.validatePin("12345"));
        assertFalse(PinValidator.validatePin("1234567"));
        assertFalse(PinValidator.validatePin("00000000"));
    }
}
