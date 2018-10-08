import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class IsogramTestsArgumentProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of("Thumbscrewjapingly", true),
                Arguments.of("Dermatoglyphics", true),
                Arguments.of("moose", false),
                Arguments.of("helLo", false),
                Arguments.of("", true)
        );
    }
}
