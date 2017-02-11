import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.IntStream;

/**
 * Inspired by rossetacode.org
 * http://rosettacode.org/wiki/Iterated_digits_squaring
 */
public class Main {
    public static void main(String[] args) {
        long count = IntStream.rangeClosed(1, 100_000_000)
                .parallel()
                .filter(n -> calculate(n) == 89)
                .count();

        System.out.println(NumberFormat.getNumberInstance(Locale.US).format(count));
    }

    public static int calculate(final int value) {
        int number = value;
        while (number != 89 && number != 1) {
            int total = 0;
            while (number > 0) {
                total += Math.pow(number % 10, 2);
                number /= 10;
            }
            number = total;
        }
        return number;
    }
}
