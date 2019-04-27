import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    private static final Map<String, String> MORSE_CODE_MAPPINGS = new HashMap<>();

    static {
        MORSE_CODE_MAPPINGS.put(".-", "A");
        MORSE_CODE_MAPPINGS.put("-...", "B");
        MORSE_CODE_MAPPINGS.put("-.-.", "C");
        MORSE_CODE_MAPPINGS.put("-..", "D");
        MORSE_CODE_MAPPINGS.put(".", "E");
        MORSE_CODE_MAPPINGS.put("..-.", "F");
        MORSE_CODE_MAPPINGS.put("--.", "G");
        MORSE_CODE_MAPPINGS.put("....", "H");
        MORSE_CODE_MAPPINGS.put("..", "I");
        MORSE_CODE_MAPPINGS.put(".---", "J");
        MORSE_CODE_MAPPINGS.put("-.-", "K");
        MORSE_CODE_MAPPINGS.put(".-..", "L");
        MORSE_CODE_MAPPINGS.put("--", "M");
        MORSE_CODE_MAPPINGS.put("-.", "N");
        MORSE_CODE_MAPPINGS.put("---", "O");
        MORSE_CODE_MAPPINGS.put(".--.", "P");
        MORSE_CODE_MAPPINGS.put("--.-", "Q");
        MORSE_CODE_MAPPINGS.put(".-.", "R");
        MORSE_CODE_MAPPINGS.put("...", "S");
        MORSE_CODE_MAPPINGS.put("-", "T");
        MORSE_CODE_MAPPINGS.put("..-", "U");
        MORSE_CODE_MAPPINGS.put("...-", "V");
        MORSE_CODE_MAPPINGS.put(".--", "W");
        MORSE_CODE_MAPPINGS.put("-..-", "X");
        MORSE_CODE_MAPPINGS.put("-.--", "Y");
        MORSE_CODE_MAPPINGS.put("--..", "Z");
        MORSE_CODE_MAPPINGS.put("-----", "0");
        MORSE_CODE_MAPPINGS.put(".----", "1");
        MORSE_CODE_MAPPINGS.put("..---", "2");
        MORSE_CODE_MAPPINGS.put("...--", "3");
        MORSE_CODE_MAPPINGS.put("....-", "4");
        MORSE_CODE_MAPPINGS.put(".....", "5");
        MORSE_CODE_MAPPINGS.put("-....", "6");
        MORSE_CODE_MAPPINGS.put("--...", "7");
        MORSE_CODE_MAPPINGS.put("---..", "8");
        MORSE_CODE_MAPPINGS.put("----.", "9");
        MORSE_CODE_MAPPINGS.put("...---...", "SOS");
        MORSE_CODE_MAPPINGS.put(".-.-.-", ".");
        MORSE_CODE_MAPPINGS.put("..--..", "?");
        MORSE_CODE_MAPPINGS.put("-.-.--", "!");
    }

    public static String decode(final String encodedMessage) {
        final String decodedMessage = Arrays.stream(encodedMessage.split(" "))
                .map(code -> MORSE_CODE_MAPPINGS.getOrDefault(code, " "))
                .collect(Collectors.joining(""));
        return decodedMessage.replaceAll("[ ]{2,}", " ").trim();
    }
}
