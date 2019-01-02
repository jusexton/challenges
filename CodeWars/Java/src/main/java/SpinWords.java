import java.util.Arrays;
import java.util.stream.Collectors;

public final class SpinWords {
    public static String spinWords(String value) {
        return Arrays.stream(value.split(" "))
                .map(word -> word.length() >= 5 ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));
    }
}
