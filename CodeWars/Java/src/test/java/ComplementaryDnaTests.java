import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Complementary Dna Tests")
public class ComplementaryDnaTests {
    @Test
    @DisplayName("Should return the complement of a given dna sequence")
    public void testMakeComplement() {
        assertEquals("TTTT", ComplementaryDna.makeComplement("AAAA"));
        assertEquals("TAACG", ComplementaryDna.makeComplement("ATTGC"));
        assertEquals("CATA", ComplementaryDna.makeComplement("GTAT"));
    }
}
