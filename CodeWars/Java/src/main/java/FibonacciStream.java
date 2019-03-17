import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class FibonacciStream {
    public static IntStream generate(int a, int b) {
        return Stream.iterate(new int[]{a, b}, s -> new int[]{s[1], s[0] + s[1]}).mapToInt(n -> n[0]);
    }
}
