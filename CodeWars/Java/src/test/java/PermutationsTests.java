import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermutationsTests {
    @Test
    public void testSinglePermutations() {
        assertEquals(new ArrayList<>(Arrays.asList("a")),
                Permutations.singlePermutations("a").stream().sorted().collect(Collectors.toList()));

        assertEquals(new ArrayList<>(Arrays.asList("ab", "ba")),
                Permutations.singlePermutations("ab").stream().sorted().collect(Collectors.toList()));

        assertEquals(new ArrayList<>(Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa")),
                Permutations.singlePermutations("aabb").stream().sorted().collect(Collectors.toList()));
    }
}
