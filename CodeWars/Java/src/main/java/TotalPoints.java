import java.util.Arrays;

public final class TotalPoints {
    public static int total(String[] points) {
        return Arrays.stream(points)
                .map(p -> p.split(":"))
                .mapToInt(p -> {
                    final int compare = p[0].compareTo(p[1]);
                    if (compare > 0) {
                        return 3;
                    } else if (compare < 0) {
                        return 0;
                    } else {
                        return 1;
                    }
                }).sum();
    }
}
