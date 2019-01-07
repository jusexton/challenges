import helpers.Permutations;

import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class ConcatenatedIntegers {
    public static Long[] collectMinAndMax(Integer[] numbers) {
        if (numbers.length == 0) {
            return new Long[]{};
        }

        LongSummaryStatistics concatenatedPermutations = Permutations.of(numbers)
                .map(stream -> stream.map(String::valueOf).collect(Collectors.joining("")))
                .mapToLong(Long::parseLong)
                .summaryStatistics();

        return new Long[]{
                concatenatedPermutations.getMin(),
                concatenatedPermutations.getMax()
        };
    }
}
