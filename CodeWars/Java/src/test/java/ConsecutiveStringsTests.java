import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsecutiveStringsTests {
    @Test
    public void test() {
        assertEquals("abigailtheta", ConsecutiveStrings.longestConsec(new String[] {
                "zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"
        }, 2));
        assertEquals("oocccffuucccjjjkkkjyyyeehh", ConsecutiveStrings.longestConsec(new String[] {
                "ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"
        }, 1));
        assertEquals("", ConsecutiveStrings.longestConsec(new String[] {}, 3));
    }
}
