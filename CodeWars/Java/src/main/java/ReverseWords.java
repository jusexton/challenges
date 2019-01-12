import java.util.Arrays;
import java.util.stream.Collectors;

public final class ReverseWords {
    // Imperative style that does not pass when given all whitespace.
    // public static String reverseWords(final String string) {
    //     String[] words = string.split(" ");
    //
    //     String[] reversedWords = new String[words.length];
    //     for (int i = 0; i < reversedWords.length; i++) {
    //         reversedWords[i] = reverseWord(words[i]);
    //     }
    //
    //     return String.join(" ", reversedWords);
    // }
    //
    // private static String reverseWord(final String word) {
    //     return new StringBuilder(word).reverse().toString();
    // }

    // Passes all tests but too complicated
    // public static String reverseWords(final String string) {
    //     Matcher matcher = Pattern.compile("(\\w+[.!?]|\\w+|\\s+)").matcher(string);
    //
    //     List<String> words = new ArrayList<>();
    //     while (matcher.find()) {
    //         words.add(matcher.group());
    //     }
    //
    //     return words.stream()
    //             .map(word -> new StringBuilder(word).reverse().toString())
    //             .collect(Collectors.joining(""));
    // }

    public static String reverseWords(final String string) {
        String[] words = string.split(" ");

        return words.length != 0 ? Arrays.stream(words)
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" ")) : string;
    }
}
