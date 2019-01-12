import java.util.Map;
import java.util.stream.Collectors;

public final class Scramblies {
    public static boolean scramble(String valueOne, String valueTwo) {
        Map<Character, Integer> characterFrequencies = getCharacterFrequencies(valueOne);

        for (char character : valueTwo.toCharArray()) {
            int count = characterFrequencies.getOrDefault(character, 0);
            if (count > 0) {
                characterFrequencies.put(character, count - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    public static Map<Character, Integer> getCharacterFrequencies(String value) {
        return value.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.summingInt(c -> 1)));
    }
}
