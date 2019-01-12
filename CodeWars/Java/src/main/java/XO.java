import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class XO {
    public static boolean equalXOs (String str) {
        Map<Character, Long> charFreqMap = str.toLowerCase().chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return charFreqMap.getOrDefault('x', 0L).equals(charFreqMap.getOrDefault('o', 0L));
    }
}
