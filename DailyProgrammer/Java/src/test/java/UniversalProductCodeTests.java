import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UniversalProductCodeTests {
    @Test
    public void testUpcFunction() {
        assertEquals(2, UniversalProductCode.upc("03600029145"));
        assertEquals(4, UniversalProductCode.upc("4210000526"));
        assertEquals(2, UniversalProductCode.upc("3600029145"));
        assertEquals(4, UniversalProductCode.upc("12345678910"));

        assertEquals(0, UniversalProductCode.upc("1234567"));
        assertEquals(0, UniversalProductCode.upc(1234567));
    }

    @Test
    public void testUpcValidationFunction() {
        assertTrue(UniversalProductCode.validate("036000291452"));
        assertTrue(UniversalProductCode.validate("123456789104"));
        assertTrue(UniversalProductCode.validate("000012345670"));
    }
}
