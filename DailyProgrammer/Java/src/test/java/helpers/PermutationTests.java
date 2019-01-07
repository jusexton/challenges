package helpers;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PermutationTests {
    @Test
    public void testOfMethod() {
        String[] letterPermutations = Permutations.of("a", "b")
                .map(stream -> stream.collect(Collectors.joining("")))
                .toArray(String[]::new);

        assertArrayEquals(new String[]{"ab", "ba"}, letterPermutations);
    }
}
