import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public final class DoubleCola {
    public static String whoIsNext(String[] names, long n) {
        final LinkedHashMap<String, Long> people = Arrays.stream(names).collect(Collectors.toMap(
                name -> name,
                name -> 1L,
                (u, v) -> {
                    throw new IllegalStateException(String.format("Duplicate key %s", u));
                },
                LinkedHashMap::new
        ));

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
