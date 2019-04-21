import java.util.Arrays;
import java.util.Comparator;

public final class HighestScoringWord {
    public static String high(final String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparing(HighestScoringWord::getScore))
                .orElse("");
    }

    private static Integer getScore(final String s) {
        return s.toLowerCase().chars().map(c -> c - 96).sum();
    }
}
