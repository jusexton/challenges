import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestScoringWordTests {
    @Test
    public void shouldReturnTheWordWitHighestScore() {
        assertEquals("taxi", HighestScoringWord.high("man i need a taxi up to ubud"));
        assertEquals("volcano", HighestScoringWord.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", HighestScoringWord.high("take me to semynak"));
    }

    @Test
    public void shouldReturnTheWordThatOccursFirstWhenScoresAreEqual() {
        assertEquals("tiy", HighestScoringWord.high("tiy yit"));
    }
}
