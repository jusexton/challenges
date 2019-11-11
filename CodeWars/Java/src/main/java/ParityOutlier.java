import java.util.Arrays;

public final class ParityOutlier {
    public static int find(int[] numbers) {
        int sum = Arrays.stream(numbers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(numbers)
                .filter(n -> Math.abs(n) % 2 == mod)
                .findFirst()
                .orElse(-1);
    }
}
