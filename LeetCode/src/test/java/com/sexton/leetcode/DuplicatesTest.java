package com.sexton.leetcode;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DuplicatesTest {
    @ParameterizedTest
    @ArgumentsSource(DuplicatesTestContainingDuplicatesArgumentProvider.class)
    public void shouldReturnTrueWhenGivenItemsThatContainDuplicates(final int[] numbers) {
        assertTrue(Duplicates.containsDuplicate(numbers));
    }

    @ParameterizedTest
    @ArgumentsSource(DuplicatesTestContainingNoDuplicatesArgumentProvider.class)
    public void shouldReturnFalseWhenGivenItemsThatDoNotContainDuplicates(final int[] numbers) {
        assertFalse(Duplicates.containsDuplicate(numbers));
    }

    public static class DuplicatesTestContainingDuplicatesArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            return Stream.of(
                    Arguments.of(new int[]{1, 1}),
                    Arguments.of(new int[]{1, 2, 3, 3}),
                    Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 1})
            );
        }
    }

    public static class DuplicatesTestContainingNoDuplicatesArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            return Stream.of(
                    Arguments.of(new int[]{}),
                    Arguments.of(new int[]{1, 2}),
                    Arguments.of(new int[]{1, 4}),
                    Arguments.of(new int[]{1, 2, 6, 4, 3, 10, 5,}),
                    Arguments.of(new int[]{1, 10000000})
            );
        }
    }
}
