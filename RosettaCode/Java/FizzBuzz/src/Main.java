import java.util.stream.IntStream;

/**
 * Inspired by rosettacode.org
 * http://rosettacode.org/wiki/FizzBuzz
 */
public class Main {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .boxed()
                .map(Main::toFizzBuzz)
                .forEach(System.out::println);

    }

    public static String toFizzBuzz(final int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
