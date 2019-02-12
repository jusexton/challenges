import java.util.Arrays;

public final class SumOfPositive {
    public static int sumOfPositive(int[] numbers) {
        return Arrays.stream(numbers).filter(number -> number > 0).sum();
    }

    // Imperative style
    // public static int sumOfPositive(int[] numbers) {
    //     int sum = 0;
    //     for (int number: numbers) {
    //         if (number > 0) {
    //             sum += number;
    //         }
    //     }
    //
    //     return sum;
    // }
}
