import java.util.Arrays;

/**
 * Inspired by Rosetta code.org
 * http://rosettacode.org/wiki/Binary_digits
 */
public class BinaryDigits {
    public static void main(String[] args) {
        Arrays.stream(args)
                .mapToInt(Integer::parseInt)
                .filter(i -> i >= 0)
                .boxed()
                .map(Integer::toBinaryString)
                .forEach(System.out::println);
    }
}
