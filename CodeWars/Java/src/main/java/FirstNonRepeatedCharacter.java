import java.util.LinkedHashMap;
import java.util.Map;

public final class FirstNonRepeatedCharacter {
    public static Character find(String str) {
        LinkedHashMap<Character, Integer> orderedFreqMap = new LinkedHashMap<>();
        for (char character : str.toCharArray()) {
            int occurrence = orderedFreqMap.getOrDefault(character, 0);
            orderedFreqMap.put(character, occurrence + 1);
        }

        // Imperative style
        // for (Map.Entry<Character, Integer> entry : orderedFreqMap.entrySet()) {
        //     if (entry.getValue() == 1) {
        //         return entry.getKey();
        //     }
        // }
        //
        // return null;

        return orderedFreqMap.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    // Solution using set
    // public static Character firstNonRepeated(String source) {
    //     Set<Character> character = new HashSet<>();
    //     Set<Character> nonRepeatedCharacter = new LinkedHashSet<>();
    //
    //     for (Character c : source.toCharArray()) {
    //         if (character.add(c)) nonRepeatedCharacter.add(c);
    //         else nonRepeatedCharacter.remove(c);
    //     }
    //
    //     return nonRepeatedCharacter.iterator().next();
    // }
}
