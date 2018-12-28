import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class TwoToOne {
    public static String longest(String s1, String s2) {
        String[] allCharacters = (s1 + s2).split("");
        Set<String> uniqueCharacter = new HashSet<>(Arrays.asList(allCharacters));
        return uniqueCharacter.stream().sorted().collect(Collectors.joining(""));
    }
}
