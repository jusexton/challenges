import java.util.stream.LongStream;

/**
 * Inspired by Rosetta code.org
 * http://rosettacode.org/wiki/Factorial
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    public static long factorial(int n) {
        if (n > 20) {
            throw new IllegalArgumentException(n + " is out of range");
        }
        return LongStream.rangeClosed(2, n).reduce(1, (a, b) -> a * b);
    }
}
