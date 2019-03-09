import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TranspositionTests {
    @Test
    public void testTranspose() {
        assertEquals("Sml etapetx", Transposition.transpose("Sample text"));
        assertEquals("eevn", Transposition.transpose("even"));
    }
}
