import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidBracesTests {
    @ParameterizedTest
    @ValueSource(strings = {
            "",
            "()",
            "(())",
            "[([])()[]{([])()}]"
    })
    public void testValidBraces(final String value) {
        assertTrue(ValidBraces.isValid(value));

    }

    @ParameterizedTest
    @ValueSource(strings = {
            "[(])",
            ")"
    })
    public void testInvalidBraces(final String value) {
        assertFalse(ValidBraces.isValid(value));
    }
}
