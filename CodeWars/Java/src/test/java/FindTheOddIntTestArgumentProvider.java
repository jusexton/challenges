import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class FindTheOddIntTestArgumentProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}, 5),
                Arguments.of(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}, -1),
                Arguments.of(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}, 5),
                Arguments.of(new int[]{10}, 10),
                Arguments.of(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}, 10),
                Arguments.of(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}, 1)
        );
    }
}
