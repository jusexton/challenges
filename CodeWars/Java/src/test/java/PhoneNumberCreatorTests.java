import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneNumberCreatorTests {
    @Test
    @DisplayName("Should return a correctly formatted number given a list of numbers.")
    public void testCreatePhoneNumber() {
        assertEquals("(123) 456-7890", PhoneNumberCreator.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
