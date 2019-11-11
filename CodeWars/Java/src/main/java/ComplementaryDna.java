import java.util.HashMap;
import java.util.Map;

public final class ComplementaryDna {
    public final static Map<Character, Character> DNA_MAPPINGS;

    static {
        DNA_MAPPINGS = new HashMap<>();
        DNA_MAPPINGS.put('A', 'T');
        DNA_MAPPINGS.put('T', 'A');
        DNA_MAPPINGS.put('C', 'G');
        DNA_MAPPINGS.put('G', 'C');
    }

    public static String makeComplement(String dna) {
        return dna.chars().mapToObj(c -> (char) c)
                .map(character -> {
                    final Character complement = DNA_MAPPINGS.get(character);
                    if (complement == null) {
                        throw new IllegalArgumentException("Dna must only contain the characters 'A', 'T', 'C' and 'G'.");
                    }
                    return complement;
                })
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
