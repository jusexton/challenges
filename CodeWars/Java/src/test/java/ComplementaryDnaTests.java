import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ComplementaryDnaTests {
    @Test
    public void shouldReturnTheComplementOfGivenDnaSequence() {
        assertEquals("TTTT", ComplementaryDna.makeComplement("AAAA"));
        assertEquals("TAACG", ComplementaryDna.makeComplement("ATTGC"));
        assertEquals("CATA", ComplementaryDna.makeComplement("GTAT"));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenGivenStringContainingInvalidCharacters() {
        final Class<? extends Exception> expectedException = IllegalArgumentException.class;
        assertThrows(expectedException, () -> ComplementaryDna.makeComplement("ABCDEFG"));
    }
}
