import java.util.Arrays;

public final class SumEvenOrOdd {
    // public static String evenOrOdd(int[] numbers) {
    //     int sum = 0;
    //     for (int number : numbers) {
    //         sum += number;
    //     }
    //
    //     return sum % 2 == 0 ? "even" : "odd";
    // }

    public static String evenOrOdd(int[] numbers) {
        return Arrays.stream(numbers).sum() % 2 == 0 ? "even" : "odd";
    }
}
