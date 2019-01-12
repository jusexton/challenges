import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class XOTests {
    @Test
    @DisplayName("Should return true if the count of x and o characters are equal")
    public void shouldTestTheTrueCasesOfEqualXOsMethod() {
        assertTrue(XO.equalXOs("xxxooo"));
        assertTrue(XO.equalXOs("xxxXooOo"));
        assertTrue(XO.equalXOs("zssddd"));
    }

    @Test
    @DisplayName("Should return false if the count of x and o characters are not equal")
    public void shouldTestTheFalseCasesOfEqualXOsMethod() {
        assertFalse(XO.equalXOs("xxx23424esdsfvxXXOOooo"));
        assertFalse(XO.equalXOs("xXxxoewrcoOoo"));
        assertFalse(XO.equalXOs("XxxxooO"));
        assertFalse(XO.equalXOs("Xxxxertr34"));
    }
}