import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Inspired by rosettacode.org
 * http://rosettacode.org/wiki/Happy_numbers
 */
public class HappyNumbers {
    public static void main(String[] args){
        System.out.println(isHappy(7));
    }

    public static boolean isHappy(final int value){
        int number = value;
        HashSet<Integer> discoveredNumbers = new HashSet<>();
        while (number != 1 && discoveredNumbers.add(number)) {
            List<Integer> digits = getDigitList(number);
            number = digits.stream()
                    .map(i -> (int)Math.pow(i, 2))
                    .reduce(0, (a, b) -> a + b);
        }
        return number == 1;
    }

    public static List<Integer> getDigitList(final int value){
        int number = value;
        List<Integer> digits = new ArrayList<>();
        while(number > 0){
            digits.add(number % 10);
            number /= 10;
        }
        return digits;
    }
}
