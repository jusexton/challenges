import java.util.LinkedHashMap;
import java.util.Map;

public final class DoubleCola {
    public static String whoIsNext(String[] names, long n) {
        final LinkedHashMap<String, Long> people = new LinkedHashMap<>();

        // Populate initial queue of people
        for (String name : names) {
            people.put(name, 1L);
        }

        while (true) {
            for (Map.Entry<String, Long> entry : people.entrySet()) {
                n -= entry.getValue();
                if (n <= 0) {
                    return entry.getKey();
                }
                people.put(entry.getKey(), entry.getValue() * 2);
            }
        }
    }
}
