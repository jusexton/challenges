package com.sexton.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Timeout(value = 50, unit = TimeUnit.MILLISECONDS)
public class SearchInsertTest {
    @Test
    public void shouldReturnZeroWhenGivenNumberArrayIsEmpty() {
        assertEquals(0, SearchInsert.searchInsert(new int[]{}, 0));
    }

    @ParameterizedTest
    @ArgumentsSource(SearchInsertTestNumberExistsArgumentProvider.class)
    public void shouldProvideIndexOfNumberIfExistsInNumbers(final int expected, final int[] numbers, final int number) {
        assertEquals(expected, SearchInsert.searchInsert(numbers, number));
    }

    @ParameterizedTest
    @ArgumentsSource(SearchInsertTestNumberDoesNotExistsArgumentProvider.class)
    public void shouldProvideIndexOfNumberIfDoesNotExistInNumbers(final int expected, final int[] numbers, final int number) {
        assertEquals(expected, SearchInsert.searchInsert(numbers, number));
    }

    private static class SearchInsertTestNumberExistsArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            // Expected, Numbers, Number
            return Stream.of(
                    Arguments.of(0, new int[]{1, 2, 3, 4}, 1),
                    Arguments.of(1, new int[]{1, 2, 3, 4}, 2),
                    Arguments.of(2, new int[]{1, 2, 3, 4}, 3),
                    Arguments.of(3, new int[]{1, 2, 3, 4}, 4)
            );
        }
    }

    private static class SearchInsertTestNumberDoesNotExistsArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            // Expected, Numbers, Number
            return Stream.of(
                    Arguments.of(0, new int[]{2, 3, 4}, 1),
                    Arguments.of(1, new int[]{1, 3, 4}, 2),
                    Arguments.of(2, new int[]{1, 2, 4}, 3),
                    Arguments.of(3, new int[]{1, 2, 3}, 4)
            );
        }
    }
}
