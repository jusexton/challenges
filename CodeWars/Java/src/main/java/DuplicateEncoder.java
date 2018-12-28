import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summingInt;

public final class DuplicateEncoder {
    public static String encode(String word) {
        String normalizedWord = word.toLowerCase();

        Map<Character, Integer> freqMap = normalizedWord.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), summingInt(c -> 1)));

        return normalizedWord.chars().mapToObj(c -> (char) c)
                .map(c -> freqMap.get(c) == 1 ? "(" : ")")
                .collect(Collectors.joining(""));
    }
}
