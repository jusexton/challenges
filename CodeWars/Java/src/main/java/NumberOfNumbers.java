import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class NumberOfNumbers {
    public static String numberOfNumbers(final int value) {
        if (value == 0) {
            return "";
        }

        final String delimiter = value > 0 ? "-" : "+";
        return IntStream.rangeClosed(1, Math.abs(value))
                .mapToObj(n -> new String(new char[n]).replace("\0", String.valueOf(n)))
                .collect(Collectors.joining(delimiter));
    }
}
