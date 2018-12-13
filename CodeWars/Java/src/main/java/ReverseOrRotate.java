import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class ReverseOrRotate {
    public static String revrot(String value, int chunkSize) {
        return getPartitions(value, chunkSize)
                .map(ReverseOrRotate::transform)
                .collect(Collectors.joining(""));
    }

    public static String transform(String value) {
        if (value.equals("") || value.length() == 1) {
            return value;
        }

        StringBuilder sb = new StringBuilder(value);
        return sumCubeOfDigits(value) % 2 == 0 ?
                sb.reverse().toString() :
                sb.append(value.charAt(0)).deleteCharAt(0).toString();
    }

    public static Stream<String> getPartitions(String value, int chunkSize) {
        if (chunkSize < 0) {
            throw new IllegalArgumentException("Chunk size cannot be negative.");
        } else if (chunkSize == 0) {
            return Stream.empty();
        }

        return IntStream.iterate(0, i -> i + chunkSize)
                .limit(value.length() / chunkSize)
                .mapToObj(i -> value.substring(i, i + chunkSize));
    }

    public static int sumCubeOfDigits(String value) {
        return value.chars()
                .mapToObj(Character::getNumericValue)
                .mapToInt(n -> (int) Math.pow(n, 3))
                .sum();
    }
}
