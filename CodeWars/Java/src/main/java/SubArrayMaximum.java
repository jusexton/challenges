public final class SubArrayMaximum {
    public static int sequence(int[] numbers) {
        int max = 0;
        int maxEnding = 0;

        for (int number : numbers) {
            maxEnding = maxEnding + number;

            if (max < maxEnding)
                max = maxEnding;
            if (maxEnding < 0)
                maxEnding = 0;
        }

        return max;
    }
}
