package com.sexton.leetcode;

import com.sexton.leetcode.util.RandomStringSupplier;
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
public class LongestCommonPrefixTest {
    @ParameterizedTest
    @ArgumentsSource(NoCommonPrefixExistArgumentProvider.class)
    public void shouldReturnEmptyStringWhenNoCommonPrefixExists(final String expected, final String[] strings) {
        assertEquals(expected, LongestCommonPrefix.longestCommonPrefix(strings));
    }

    @ParameterizedTest
    @ArgumentsSource(LongestCommonPrefixTestArgumentProvider.class)
    public void shouldReturnTheLongestCommonPrefixOfGivenStrings(final String expected, final String[] strings) {
        assertEquals(expected, LongestCommonPrefix.longestCommonPrefix(strings));
    }

    @ParameterizedTest
    @ArgumentsSource(LongestCommonPrefixStressTestArgumentProvider.class)
    public void shouldReturnTheLongestCommonPrefixEasilyWhenGivenLargeLongStrings(final String expected, final String[] strings) {
        assertEquals(expected, LongestCommonPrefix.longestCommonPrefix(strings));
    }

    public static class NoCommonPrefixExistArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            return Stream.of(
                    Arguments.of("", new String[]{"test", "hello", "the", "hike"}),
                    Arguments.of("", new String[]{"test", "two", "the", "hike"}),
                    Arguments.of("", new String[]{"apple", "aunt", "the", "annie"})
            );
        }
    }

    private static class LongestCommonPrefixTestArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of("a", new String[]{"a"}),
                    Arguments.of("gee", new String[]{"geezer", "geepers", "gee", "geek"}),
                    Arguments.of("a", new String[]{"apple", "aunt", "annie", "ant"}),
                    Arguments.of("race", new String[]{"racecar", "race", "racer", "raced"})
            );
        }
    }

    private static class LongestCommonPrefixStressTestArgumentProvider implements ArgumentsProvider {
        private static final int PREFIX_LENGTH = 1000;
        private static final int STRING_LENGTH = 1000;
        private static final int STRING_LIMIT = 100;

        private RandomStringSupplier randomPrefixSupplier;
        private RandomStringSupplier randomStringSupplier;

        public LongestCommonPrefixStressTestArgumentProvider() {
            this.randomPrefixSupplier = new RandomStringSupplier(PREFIX_LENGTH);
            this.randomStringSupplier = new RandomStringSupplier(STRING_LENGTH - PREFIX_LENGTH);
        }

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    buildStressTestArguments()
            );
        }

        private StressTestArgument buildStressTestArguments() {
            final String prefix = randomPrefixSupplier.get();
            final String[] strings = Stream.generate(randomStringSupplier)
                    .limit(STRING_LIMIT)
                    .map(s -> prefix + s)
                    .toArray(String[]::new);

            return new StressTestArgument(prefix, strings);
        }

        private static class StressTestArgument implements Arguments {
            private String prefix;
            private String[] strings;

            public StressTestArgument(final String prefix, final String[] strings) {
                this.prefix = prefix;
                this.strings = strings;
            }

            public String getPrefix() {
                return prefix;
            }

            public String[] getStrings() {
                return strings;
            }

            @Override
            public Object[] get() {
                return new Object[]{prefix, strings};
            }
        }
    }
}
