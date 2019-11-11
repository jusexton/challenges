package helpers;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTests {
    @ParameterizedTest
    @ArgumentsSource(BookLabelArgumentProvider.class)
    public void shouldBeBuiltCorrectlyAndYieldExpectedValues(final ExpectedBookValues expectedBookValues, final String label) {
        final Book book = new Book(label);

        assertEquals(expectedBookValues.getCategory(), book.getCategory());
        assertEquals(expectedBookValues.getCode(), book.getCode());
        assertEquals(expectedBookValues.getQuantity(), book.getQuantity());
    }

    private static class BookLabelArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(new ExpectedBookValues("A", "BC", 200), "ABC 200"),
                    Arguments.of(new ExpectedBookValues("W", "W", 1), "WW 1")
            );
        }
    }

    private static class ExpectedBookValues {
        private final String category;
        private final String code;
        private final int quantity;

        public ExpectedBookValues(final String category, final String code, final int quantity) {
            this.category = category;
            this.code = code;
            this.quantity = quantity;
        }

        public String getCategory() {
            return category;
        }

        public String getCode() {
            return code;
        }

        public int getQuantity() {
            return quantity;
        }
    }
}
