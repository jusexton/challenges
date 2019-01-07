import java.util.*;
import java.util.function.ToIntFunction;

/**
 * Inspired by r/dailyprogrammer
 * https://www.reddit.com/r/dailyprogrammer/comments/5go843/20161205_challenge_294_easy_rack_management_1/
 * All bonuses
 */
public final class Scrabble {
    private static final Map<Character, Integer> SCORE_MAP;

    static {
        Map<Character, Integer> tempMap = new HashMap<>();
        tempMap.put('?', 0);
        tempMap.put('a', 1);
        tempMap.put('e', 1);
        tempMap.put('i', 1);
        tempMap.put('l', 1);
        tempMap.put('n', 1);
        tempMap.put('o', 1);
        tempMap.put('r', 1);
        tempMap.put('s', 1);
        tempMap.put('t', 1);
        tempMap.put('u', 1);
        tempMap.put('d', 2);
        tempMap.put('g', 2);
        tempMap.put('b', 3);
        tempMap.put('c', 3);
        tempMap.put('m', 3);
        tempMap.put('p', 3);
        tempMap.put('f', 4);
        tempMap.put('h', 4);
        tempMap.put('v', 4);
        tempMap.put('w', 4);
        tempMap.put('y', 4);
        tempMap.put('k', 5);
        tempMap.put('j', 8);
        tempMap.put('x', 8);
        tempMap.put('q', 10);
        tempMap.put('z', 10);
        SCORE_MAP = Collections.unmodifiableMap(tempMap);
    }

    public static int getScrabbleScore(final String word) {
        return word.chars()
                .mapToObj(c -> (char) c)
                .mapToInt(c -> SCORE_MAP.getOrDefault(c, 0))
                .sum();
    }

    public static String getScrabbleWordByComparator(final List<String> words, final String tiles, final ToIntFunction<String> comparator) {
        return words.stream()
                .filter(x -> scrabble(tiles, x))
                .max(Comparator.comparingInt(comparator))
                .orElse("");
    }

    public static boolean scrabble(String tiles, String word) {
        for (char c : word.toCharArray()) {
            if (tiles.indexOf(c) != -1) {
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
