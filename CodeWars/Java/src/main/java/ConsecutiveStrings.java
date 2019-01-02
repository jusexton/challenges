import java.util.ArrayList;
import java.util.Comparator;

public final class ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {
        if (k > strarr.length) {
            return "";
        }

        final ArrayList<String> consecutiveStrings = new ArrayList<>();
        for (int i = 0; i <= strarr.length - k; i++) {
            final StringBuilder sb = new StringBuilder();
            for (int j = 0; j < k; j++) {
                sb.append(strarr[i + j]);
            }
            consecutiveStrings.add(sb.toString());
        }
        consecutiveStrings.sort(Comparator.comparingInt(String::length).reversed());
        return consecutiveStrings.get(0);
    }
}
