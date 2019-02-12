import java.util.Arrays;
import java.util.stream.Collectors;

public final class SimplePigLatin {
    // public static String pigIt(String str) {
    //     String[] words = str.split(" ");
    //
    //     String[] pigWords = new String[words.length];
    //     for (int i = 0; i < words.length; i++) {
    //         String word = words[i];
    //         if (word.length() == 1) {
    //             pigWords[i] = word;
    //             continue;
    //         }
    //
    //         pigWords[i] = word.substring(1) + word.charAt(0) + "ay";
    //     }
    //
    //     return String.join(" ", pigWords);
    // }

    public static String pigIt(String str) {
        return Arrays.stream(str.split(" "))
                .map(word -> word.matches("\\p{Punct}") ? word : word.substring(1) + word.charAt(0) + "ay")
                .collect(Collectors.joining(" "));
    }

    // Refactored and probably best way of performing such action
    // public static String pigIt(String str) {
    //     return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    // }
}
