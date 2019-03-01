import java.util.Arrays;
import java.util.IntSummaryStatistics;

public final class HighestProfit {
    public static int[] minMax(int[] array) {
        IntSummaryStatistics stats = Arrays.stream(array).summaryStatistics();
        return new int[]{stats.getMin(), stats.getMax()};
    }

    // public static int[] minMax(int[] array) {
    //     int min = array[0];
    //     int max = array[0];
    //
    //     // Start at one to skip the first element.
    //     // We already assigned it to min and max
    //     for (int i = 1; i < array.length; i++) {
    //         int value = array[i];
    //
    //         if (value < min) {
    //             min = value;
    //             continue;
    //         }
    //
    //         if (value > max) {
    //             max = value;
    //         }
    //     }
    //
    //     return new int[]{min, max};
    // }
}
