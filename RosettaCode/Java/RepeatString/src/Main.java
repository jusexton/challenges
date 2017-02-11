import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Inspired by rosettacode.org
 * http://rosettacode.org/wiki/Repeat_a_string
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(repeatString("ha", 5));
    }

    private static String repeatString(final String s, final int count) {
        return Stream.generate(() -> s)
                .limit(count)
                .collect(Collectors.joining(""));
    }
}
