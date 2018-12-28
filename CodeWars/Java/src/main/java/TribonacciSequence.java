import java.util.Arrays;

public final class TribonacciSequence {
    // First attempt
    // public double[] tribonacci(double[] s, int n) {
    //     if (n == 0) {
    //         return new double[]{};
    //     }
    //
    //     double[] result = new double[n];
    //     System.arraycopy(s, 0, result, 0, n > s.length ? s.length : n);
    //
    //     int index = s.length;
    //     while (index < n) {
    //         result[index] = result[index - 1] + result[index - 2] + result[index - 3];
    //         index++;
    //     }
    //
    //     return result;
    // }

    // Refactored
    public double[] tribonacci(double[] s, int n) {
        double[] result = Arrays.copyOf(s, n);
        for (int i = 0; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }
        return result;
    }
}
