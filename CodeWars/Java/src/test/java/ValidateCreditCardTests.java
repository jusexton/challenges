import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateCreditCardTests {
    @Test
    public void shouldReturnTrueWhenGivenValidCreditCardNumber() {
        assertTrue(ValidateCreditCard.validate("224"));
    }

    @Test
    public void shouldReturnFalseWhenGivenInvalidCreditCardNumber() {
        assertFalse(ValidateCreditCard.validate(""));
        assertFalse(ValidateCreditCard.validate("223"));
    }
}
