import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class ScrabbleTests {
    private static final String DICTIONARY_PATH = "scrabble/english-words.txt";
    private static List<String> words;

    @BeforeAll
    public static void setup() throws IOException {
        Path path = new File(Objects.requireNonNull(ScrabbleTests.class.getClassLoader().getResource(DICTIONARY_PATH))
                .getFile())
                .toPath();
        words = Files.lines(path).collect(Collectors.toList());
    }

    @Test
    public void testScrabbleFunction() {
        assertTrue(Scrabble.scrabble("ladilmy", "daily"));
        assertTrue(Scrabble.scrabble("orrpgma", "program"));

        assertFalse(Scrabble.scrabble("orppgma", "program"));
        assertFalse(Scrabble.scrabble("eerriin", "eerie"));
    }

    @Test
    public void testScrabbleFunctionWithWildCards() {
        assertTrue(Scrabble.scrabble("pizza??", "pizzazz"));
        assertTrue(Scrabble.scrabble("a??????", "program"));

        assertFalse(Scrabble.scrabble("piizza?", "pizzazz"));
        assertFalse(Scrabble.scrabble("b??????", "program"));
    }

    @Test
    public void testGetWordFunctionWithLengthComparator() {
        assertEquals("coauthored", Scrabble.getScrabbleWordByComparator(words, "dcthoyueorza", String::length));
        assertEquals("turquois", Scrabble.getScrabbleWordByComparator(words, "uruqrnytrois", String::length));
        assertEquals("greengrocery", Scrabble.getScrabbleWordByComparator(words, "rryqeiaegicgeo??", String::length));
        assertEquals("subordinately", Scrabble.getScrabbleWordByComparator(words, "udosjanyuiuebr??", String::length));
        assertEquals("ovolactovegetarian", Scrabble.getScrabbleWordByComparator(words, "vaakojeaietg????????", String::length));
    }

    @Test
    public void testScrabbleScoreFunction() {
        assertEquals(0, Scrabble.getScrabbleScore(""));
        assertEquals(2, Scrabble.getScrabbleScore("aa"));
        assertEquals(11, Scrabble.getScrabbleScore("az"));
    }

    @Test
    @Disabled("Not all assertions are true")
    public void testGetWordFunctionWithScoreComparator() {
        assertEquals("zydeco", Scrabble.getScrabbleWordByComparator(words, "dcthoyueorza", Scrabble::getScrabbleScore));
        assertEquals("squinty", Scrabble.getScrabbleWordByComparator(words, "uruqrnytrois", Scrabble::getScrabbleScore));
        // TODO: Test failing because function only accounts for the word that can be made and not the tiles used.
        assertEquals("reacquiring", Scrabble.getScrabbleWordByComparator(words, "rryqeiaegicgeo??", Scrabble::getScrabbleScore));
        assertEquals("jaybirds", Scrabble.getScrabbleWordByComparator(words, "udosjanyuiuebr??", Scrabble::getScrabbleScore));
        assertEquals("straightjacketed", Scrabble.getScrabbleWordByComparator(words, "vaakojeaietg????????", Scrabble::getScrabbleScore));
    }
}
