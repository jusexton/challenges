import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareEveryDigitTests {
    @Test
    @DisplayName("Should return an integer with all of a given integers digits squared")
    public void testSquareDigits() {
        assertEquals(811181, new SquareEveryDigit().squareDigits(9119));
    }
}
