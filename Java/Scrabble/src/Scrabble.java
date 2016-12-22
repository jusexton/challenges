import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Inspired by r/dailyprogrammer
 * https://www.reddit.com/r/dailyprogrammer/comments/5go843/20161205_challenge_294_easy_rack_management_1/
 * All bonuses
 */
public class Scrabble {
    private static final String DICTIONARY_PATH = "Data//EnglishWords.txt";
    private static final String HIGHEST_TESTS_PATH = "Data//HighestFunctionTests.txt";
    private static final String LONGEST_TESTS_PATH = "Data//LongestFunctionTests.txt";
    private static final String SCRABBLE_TESTS_PATH = "Data//ScrabbleFunctionTests.txt";

    public static void main(String[] args) throws IOException{
        loadFile(new File(SCRABBLE_TESTS_PATH))
                .forEach(x -> {
                    String[] t = x.split(",");
                    System.out.println(scrabble(t[0], t[1]));
                });

        // TODO: Must be a prettier way to implement this.
        loadFile(new File(LONGEST_TESTS_PATH))
                .forEach(x ->{
                    try {
                        System.out.println(longest(x));
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.exit(1);
                    }
                });

        // TODO: Must be a prettier way to implement this.
        loadFile(new File(HIGHEST_TESTS_PATH))
                .forEach(x ->{
                    try {
                        System.out.println(highest(x));
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.exit(1);
                    }
                });
    }

    public static int getScore(String word){
        int score = 0;
        for (char c : word.toCharArray()) {
            switch (c){
                case '?':
                    score += 0;
                    break;
                case 'a': case 'e': case 'i': case 'l': case 'n': case 'o': case 'r': case 's': case 't': case 'u':
                    score += 1;
                    break;
                case 'd': case 'g':
                    score += 2;
                    break;
                case 'b': case 'c': case 'm': case 'p':
                    score += 3;
                    break;
                case 'f': case 'h': case 'v':  case 'w': case 'y':
                    score += 4;
                    break;
                case 'k':
                    score += 5;
                    break;
                case 'j': case 'x':
                    score += 8;
                    break;
                case 'q': case 'z':
                    score += 10;
                    break;
            }
        }
        return score;
    }

    // TODO: Combine highest and longest function by passing the KeyExtractor.
    public static String highest(String tiles) throws IOException{
        Optional<String> result = loadFile(new File(DICTIONARY_PATH))
                .filter(x -> scrabble(tiles, x))
                .max(Comparator.comparing(Scrabble::getScore));

        return result.isPresent() ? result.get() : null;
    }

    public static Stream<String> loadFile(File file) throws IOException{
        return Files.lines(file.toPath());
    }

    // TODO: Combine highest and longest function by passing the KeyExtractor.
    public static String longest(String tiles) throws IOException {
        Optional<String> result = loadFile(new File(DICTIONARY_PATH))
                .filter(x -> scrabble(tiles, x))
                .max(Comparator.comparingInt(String::length));

        return result.isPresent() ? result.get() : null;
    }

    // TODO: Find more efficient way of implementation.
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
}
