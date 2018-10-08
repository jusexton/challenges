import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class FindTheOddInt {
    public static int find(int[] numbers) {
        Map<Integer, Long> numberOccurrences = Arrays.stream(numbers).boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        return numberOccurrences.entrySet().stream()
                .filter(x -> x.getValue() % 2 == 1)
                .findFirst()
                .get().getKey();
    }
}
