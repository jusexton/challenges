import java.util.Arrays;
import java.util.stream.IntStream;

public class ParityOutlier {
    // public static int find(int[] numbers) {
    //     boolean outlierIsEven;
    //     if (isOdd(numbers[0] + numbers[1])) {
    //         return isOdd(numbers[0]) && isOdd(numbers[2]) ? numbers[1] : numbers[0];
    //     } else {
    //         outlierIsEven = isOdd(numbers[0]);
    //     }
    //
    //     for (int i = 2; i < numbers.length; i++) {
    //         boolean isOdd = isOdd(numbers[i]);
    //         if ((outlierIsEven && !isOdd) || (!outlierIsEven && isOdd)) {
    //             return numbers[i];
    //         }
    //     }
    //
    //     return -1;
    // }
    //
    // private static boolean isOdd(int number) {
    //     return Math.abs(number) % 2 == 1;
    // }

    public static int find(int[] numbers) {
        int sum = Arrays.stream(numbers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        // We only want to use a parallel stream if there are a lot of given numbers.
        IntStream numberStream = numbers.length > 1000 ?
                Arrays.stream(numbers).parallel() :
                Arrays.stream(numbers);

        return numberStream.filter(n -> Math.abs(n) % 2 == mod).findFirst().orElse(-1);
    }
}
