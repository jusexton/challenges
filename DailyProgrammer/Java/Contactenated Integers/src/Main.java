import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    private static final Integer[] TEST_INTS = {420, 34, 19, 71, 341};

    public static void main(String[] args) {
        Long[] result = collectMinAndMax(TEST_INTS);
        System.out.println(String.format("Min: %s%nMax: %s", result[0], result[1]));
    }

    @NotNull
    private static Long[] collectMinAndMax(Integer[] numbers) {
        long[] concatIntPermutations = Permutations.of(numbers)
                .map(stream -> stream.map(Object::toString).collect(Collectors.joining("")))
                .mapToLong(Long::parseLong)
                .toArray();

        return new Long[]{
            Arrays.stream(concatIntPermutations).min().getAsLong(),
            Arrays.stream(concatIntPermutations).max().getAsLong()
        };
    }
}
