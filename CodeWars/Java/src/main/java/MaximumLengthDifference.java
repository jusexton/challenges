import java.util.Arrays;
import java.util.IntSummaryStatistics;

public final class MaximumLengthDifference {
    public static int mxdiflg(final String[] a1, final String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }

        final IntSummaryStatistics a1Stats = getStringLengthSummaryStats(a1);
        final IntSummaryStatistics a2Stats = getStringLengthSummaryStats(a2);

        int potentialResultOne = Math.abs(a2Stats.getMax() - a1Stats.getMin());
        int potentialResultTwo = Math.abs(a2Stats.getMin() - a1Stats.getMax());
        return potentialResultOne > potentialResultTwo ? potentialResultOne : potentialResultTwo;
    }

    private static IntSummaryStatistics getStringLengthSummaryStats(String[] array) {
        return Arrays.stream(array).mapToInt(String::length).summaryStatistics();
    }
}
