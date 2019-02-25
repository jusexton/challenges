import java.util.Arrays;
import java.util.stream.Collectors;

public final class EncryptThis {
    public static String encrypt(String message) {
        return message.isEmpty() ? message : Arrays.stream(message.split(" ")).map(EncryptThis::encryptWord).collect(Collectors.joining(" "));
    }

    private static String encryptWord(String word) {
        char firstCharacter = word.charAt(0);
        String firstAsciiValue = String.valueOf((int) firstCharacter);

        String newWord = word.replaceFirst(String.valueOf(firstCharacter), firstAsciiValue);
        return word.length() < 3 ? newWord : swapCharacters(newWord, firstAsciiValue.length(), newWord.length() - 1);
    }

    private static String swapCharacters(String word, int indexOne, int indexTwo) {
        char[] newWordCharacters = word.toCharArray();
        char temp = newWordCharacters[indexOne];
        newWordCharacters[indexOne] = newWordCharacters[indexTwo];
        newWordCharacters[indexTwo] = temp;
        return new String(newWordCharacters);
    }
}
