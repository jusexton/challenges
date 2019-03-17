import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class NumberOfNumbers {
    public static String numberOfNumbers(final int value) {
        if (value == 0) {
            return "";
        }

        final String delimiter = value > 0 ? "-" : "+";
        return IntStream.rangeClosed(1, Math.abs(value))
                .mapToObj(n -> Stream.generate(() -> String.valueOf(n)).limit(n).collect(Collectors.joining("")))
                .collect(Collectors.joining(delimiter));
    }
}
