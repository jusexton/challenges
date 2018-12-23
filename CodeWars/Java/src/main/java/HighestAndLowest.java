import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public final class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String[] characters = numbers.split(" ");

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < characters.length; i++) {
            int number = Integer.parseInt(characters[i]);
            if (number < low) {
                low = number;
            }

            if (number > high) {
                high = number;
            }
        }

        return String.format("%s %s", high, low);
    }

    public static String highAndLowWithIterator(String numbers) {
        String[] characters = numbers.split(" ");

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (String character : characters) {
            int number = Integer.parseInt(character);
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
        int[] sortedNumbers = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        return String.format("%s %s", sortedNumbers[sortedNumbers.length - 1], sortedNumbers[0]);
    }

    public static String highAndLowWithStatistics(String numbers) {
        IntSummaryStatistics summary = Arrays.stream(numbers.split(" "))
                .collect(Collectors.summarizingInt(Integer::parseInt));

        return String.format("%s %s", summary.getMax(), summary.getMin());
    }
}
