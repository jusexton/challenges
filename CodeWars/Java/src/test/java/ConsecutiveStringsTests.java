import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsecutiveStringsTests {
    @Test
    @DisplayName("Should return the longest consecutive string given a list of strings and K the length of strings to concatenate")
    public void testLongestConsecutiveString() {
        assertEquals("abigailtheta", ConsecutiveStrings.longestConsec(new String[] {
                "zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"
        }, 2));

        assertEquals("oocccffuucccjjjkkkjyyyeehh", ConsecutiveStrings.longestConsec(new String[] {
                "ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"
        }, 1));

        assertEquals("", ConsecutiveStrings.longestConsec(new String[] {}, 3));
    }
}
