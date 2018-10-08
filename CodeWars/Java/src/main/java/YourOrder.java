import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class YourOrder {
    public static String order(String words) {
        if (words.isEmpty()) {
            return words;
        }

        Pattern pattern = Pattern.compile("[1-9]");
        return Arrays.stream(words.split(" "))
                .sorted((a, b) -> {
                    Matcher firstMatcher = pattern.matcher(a);
                    Integer firstNumber = firstMatcher.find() ? Integer.parseInt(firstMatcher.group()) : -1;
                    Matcher secondMatcher = pattern.matcher(b);
                    Integer secondNumber = secondMatcher.find() ? Integer.parseInt(secondMatcher.group()) : -1;
                    return firstNumber.compareTo(secondNumber);
                })
                .collect(Collectors.joining(" "));
    }

//    Refined Version
//    public static String order(String words) {
//        return Arrays.stream(words.split(" "))
//                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
//                .reduce((a, b) -> a + " " + b).get();
//    }
}
