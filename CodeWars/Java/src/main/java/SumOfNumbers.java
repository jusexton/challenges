import java.util.stream.IntStream;

public final class SumOfNumbers {
    public static int sumRange(int a, int b) {
        if (a == b) {
            // Can return either a or b, does not matter because they are equal.
            return a;
        } else if (a + b == 0) {
            return 0;
        } else if (b < a) {
            return sumRange(b, a);
        }

        return IntStream.rangeClosed(a, b).sum();
    }

    // Optimized
    // public int GetSum(int a, int b) {
    //     return (a + b) * (Math.abs(a - b) + 1) / 2;
    // }
}
