import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public final class HighestAndLowest {
    public static String highAndLow(String numbers) {
        final String[] characters = numbers.split(" ");

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (String character : characters) {
            final int number = Integer.parseInt(character);
            if (number < low) {
                low = number;
            }

            if (number > high) {
                high = number;
            }
        }

        return String.format("%s %s", high, low);
    }

    public static String highAndLowBySorting(String numbers) {
        final int[] sortedNumbers = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        return String.format("%s %s", sortedNumbers[sortedNumbers.length - 1], sortedNumbers[0]);
    }
}
