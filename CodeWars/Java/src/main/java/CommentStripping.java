import java.util.Arrays;
import java.util.stream.Collectors;

public final class CommentStripping {
    public static String stripComments(String text, String[] commentSymbols) {
        final String commentPattern = String.format("\\s+([%s](.*))?$", String.join("", commentSymbols));
        return Arrays.stream(text.split("\n"))
                .map(line -> line.replaceAll(commentPattern, ""))
                .collect(Collectors.joining("\n"));
    }
}
