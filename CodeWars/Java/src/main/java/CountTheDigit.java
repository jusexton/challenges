import java.util.stream.IntStream;

public final class CountTheDigit {
    // public static int nbDig(int n, int d) {
    //     return (int) IntStream.rangeClosed(0, n)
    //             .map(number -> number * number)
    //             .mapToObj(String::valueOf)
    //             .mapToLong(s -> s.chars().filter(c -> c == Character.forDigit(d, 10)).count())
    //             .sum();
    // }

    public static int nbDig(int n, int d) {
        char digit = Character.forDigit(d, 10);
        return (int) IntStream.rangeClosed(0, n)
                .map(number -> number * number)
                .flatMap(number -> String.valueOf(number).chars())
                .filter(c -> c == digit)
                .count();
    }
}
