import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Inspired by r/dailyprogrammer
 * https://www.reddit.com/r/dailyprogrammer/comments/5go843/20161205_challenge_294_easy_rack_management_1/
 */
public class Scrabble {
    private static final String DICTIONARY_PATH = "Data//EnglishWords.txt";
    private static final String LONGEST_TESTS_PATH = "Data//LongestFunctionTests.txt";
    private static final String SCRABBLE_TESTS_PATH = "Data//ScrabbleFunctionTests.txt";

    public static void main(String[] args) {
        loadFile(new File(SCRABBLE_TESTS_PATH))
                .forEach(x -> {
                    String[] t = x.split(",");
                    System.out.println(scrabble(t[0], t[1]));
                });

        loadFile(new File(LONGEST_TESTS_PATH))
                .forEach(x -> System.out.println(longest(x)));

    }

    public static String highest(String tiles){
        return ""; // temporary
    }

    public static String longest(String tiles) {
        Optional<String> result = loadFile(new File(DICTIONARY_PATH))
                .filter(x -> scrabble(tiles, x))
                .max(Comparator.comparingInt(String::length));

        return result.isPresent() ? result.get() : null;
    }

    public static boolean scrabble(String tiles, String word){
        for (char c : word.toCharArray()){
            if (tiles.indexOf(c) != -1){
                tiles = tiles.replaceFirst(String.valueOf(c), "");
            } else if (tiles.contains("?")) {
                tiles = tiles.replaceFirst("\\?", "");
            } else {
                return false;
            }
        }
        return true;
    }

    public static Stream<String> loadFile(File file) {
        try{
            return Files.lines(file.toPath());
        } catch (IOException e) {
            return null;
        }
    }
}
