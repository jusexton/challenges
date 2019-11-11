import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PermutationsTests {
    @Test
    @DisplayName("Should return all permutations of a given character sequence")
    public void testSinglePermutations() {
        assertEquals(new HashSet<>(Collections.singletonList("a")),
                Permutations.singlePermutations("a"));

        assertEquals(new HashSet<>(Arrays.asList("ab", "ba")),
                Permutations.singlePermutations("ab"));

        assertEquals(new HashSet<>(Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa")),
                Permutations.singlePermutations("aabb"));
    }

    @Test
    public void shouldReturnNullWhenGivenStringIsNull() {
        assertNull(Permutations.singlePermutations(null));
    }
}
