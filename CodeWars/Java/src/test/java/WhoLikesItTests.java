import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Who Likes It Tests")
public class WhoLikesItTests {
    @DisplayName("Should a correctly formatted string of names given the list of names.")
    @ParameterizedTest()
    @ArgumentsSource(WhoLikesItTests.WhoLikesItTestsArgumentProvider.class)
    public void testWhoLikesIt(String expected, String... names) {
        assertEquals(expected, WhoLikesIt.whoLikesIt(names));
    }

    public static class WhoLikesItTestsArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of("no one likes this", new String[]{}),
                    Arguments.of("Peter likes this", new String[]{"Peter"}),
                    Arguments.of("Peter and Alex like this", new String[]{"Peter", "Alex"}),
                    Arguments.of("Peter, Alex and Tom like this", new String[]{"Peter", "Alex", "Tom"}),
                    Arguments.of("Peter, Alex and 2 others like this", new String[]{"Peter", "Alex", "Tom", "Max"}),
                    Arguments.of("Peter, Alex and 3 others like this", new String[]{"Peter", "Alex", "Tom", "Max", "Tommy"})
            );
        }
    }
}
