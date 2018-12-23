import java.util.Map;

import static java.util.Map.entry;

public final class ComplementaryDna {
    public final static Map<Character, Character> DNA_MAPPING = Map.ofEntries(
            entry('A', 'T'),
            entry('T', 'A'),
            entry('C', 'G'),
            entry('G', 'C')
    );

    // public static String makeComplement(String dna) {
    //     char[] complement = new char[dna.length()];
    //
    //     for (int i = 0; i < dna.length(); i++) {
    //         char character = dna.charAt(i);
    //         if (character == 'A') {
    //             complement[i] = 'T';
    //         } else if (character == 'T') {
    //             complement[i] = 'A';
    //         } else if (character == 'C') {
    //             complement[i] = 'G';
    //         } else if (character == 'G') {
    //             complement[i] = 'C';
    //         } else {
    //             throw new IllegalArgumentException("Dna must only contain the characters ATGC.");
    //         }
    //     }
    //
    //     return new String(complement);
    // }

    // public static String makeComplement(String dna) {
    //     char[] complement = new char[dna.length()];
    //
    //     for (int i = 0; i < dna.length(); i++) {
    //         char character = dna.charAt(i);
    //         switch (character) {
    //             case 'A':
    //                 complement[i] = 'T';
    //                 break;
    //             case 'T':
    //                 complement[i] = 'A';
    //                 break;
    //             case 'C':
    //                 complement[i] = 'G';
    //                 break;
    //             case 'G':
    //                 complement[i] = 'C';
    //                 break;
    //             default:
    //                 throw new IllegalArgumentException("Dna must only contain the characters ATGC.");
    //         }
    //     }
    //
    //     return new String(complement);
    // }

    // public static String makeComplement(String dna) {
    //     StringBuilder sb = new StringBuilder();
    //
    //     for (char character : dna.toCharArray()) {
    //         Character complement = DNA_MAPPING.get(character);
    //         if (complement == null) {
    //             throw new IllegalArgumentException("Dna must only contain the characters ATGC.");
    //         }
    //         sb.append(complement);
    //     }
    //
    //     return sb.toString();
    // }

    public static String makeComplement(String dna) {
        return dna.chars().mapToObj(c -> (char) c)
                .map(character -> {
                    Character complement = DNA_MAPPING.get(character);
                    if (complement == null) {
                        throw new IllegalArgumentException("Dna must only contain the characters ATGC.");
                    }
                    return complement;
                })
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();

    }
}
