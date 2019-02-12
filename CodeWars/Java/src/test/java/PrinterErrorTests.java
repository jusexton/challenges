import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterErrorTests {
    @Test
    @DisplayName("Should return the number of errors in a given printer string along with the total number of characters in the string.")
    public void testPrinterErrorsMethod() {
        assertEquals("3/3", PrinterErrors.printerError("xyz"));
        assertEquals("1/4", PrinterErrors.printerError("abcx"));
        assertEquals("3/56", PrinterErrors.printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
    }
}
