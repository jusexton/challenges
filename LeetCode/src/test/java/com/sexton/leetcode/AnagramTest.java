package com.sexton.leetcode;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramTest {
    @ParameterizedTest
    @ArgumentsSource(ValidAnagramsArgumentProvider.class)
    public void shouldReturnTrueWhenGivenTwoStringsThatAreAnagrams(final String stringOne, final String stringTwo) {
        assertTrue(Anagrams.isAnagram(stringOne, stringTwo));
    }

    @ParameterizedTest
    @ArgumentsSource(InValidAnagramsArgumentProvider.class)
    public void shouldReturnFalseWhenGivenTwoStringsThatAreNotAnagrams(final String stringOne, final String stringTwo) {
        assertFalse(Anagrams.isAnagram(stringOne, stringTwo));
    }

    public static class ValidAnagramsArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            return Stream.of(
                    Arguments.of("", ""),
                    Arguments.of("a", "a"),
                    Arguments.of("ba", "ab"),
                    Arguments.of("cat", "tac"),
                    Arguments.of("hello there", "there hello")
            );
        }
    }

    public static class InValidAnagramsArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            // StringOne, StringTwo
            return Stream.of(
                    Arguments.of("123", "5"),
                    Arguments.of("5", ""),
                    Arguments.of("hello", "ollhh")
            );
        }
    }
}
