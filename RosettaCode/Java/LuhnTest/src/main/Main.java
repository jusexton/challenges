package main;

import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Inspired by rosettacode.ord
 * http://rosettacode.org/wiki/Luhn_test_of_credit_card_numbers
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(luhnTest(49927398716L));
        System.out.println(luhnTest(49927398717L));
        System.out.println(luhnTest(1234567812345678L));
        System.out.println(luhnTest(1234567812345670L));
    }

    public static boolean luhnTest(final long value) {
        List<Integer> digits = getDigits(value);
        int sum = IntStream.range(0, digits.size())
                .map(i -> i % 2 == 0 ? digits.get(i) : sumDigits(digits.get(i) * 2))
                .sum();
        return sum % 10 == 0;
    }

    /**
     * Returns each digit of a number in backwards order.
     *
     * @param value The value that will be split by each digit.
     * @return List of each digit in a value in reverse order.
     */
    public static List<Integer> getDigits(final long value) {
        long number = value;
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add((int) (number % 10));
            number /= 10;
        }
        return digits;
    }

    /**
     * Helper function for luhnTest.
     *
     * @param value The value that will have each of its digits summed.
     * @return summation of the digits in a value.
     */
    @Contract(pure = true)
    public static int sumDigits(final long value) {
        return getDigits(value).stream().reduce(0, (a, b) -> a + b);
    }
}
