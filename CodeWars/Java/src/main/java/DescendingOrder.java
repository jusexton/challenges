import java.util.Comparator;
import java.util.stream.Collectors;

public final class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.parseInt(String.valueOf(num).chars()
                .mapToObj(Character::toString)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining("")));
    }
}