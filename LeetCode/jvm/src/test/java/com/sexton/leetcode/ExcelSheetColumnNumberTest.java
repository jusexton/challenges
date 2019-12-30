package com.sexton.leetcode;

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
public class ExcelSheetColumnNumberTest {
    @ParameterizedTest
    @ArgumentsSource(ExcelSheetColumnNumberTestArgumentProvider.class)
    public void shouldCorrectlyReturnExcelColumnTitleAsNumber(final int expected, final String input) {
        assertEquals(expected, ExcelSheetColumnNumber.imperativeTitleToNumber(input));
        assertEquals(expected, ExcelSheetColumnNumber.functionalTitleToNumber(input));
    }

    public static class ExcelSheetColumnNumberTestArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            // Expected, Input
            return Stream.of(
                    Arguments.of(0, null),
                    Arguments.of(0, ""),
                    Arguments.of(1, "A"),
                    Arguments.of(2, "B"),
                    Arguments.of(26, "Z"),
                    Arguments.of(27, "AA"),
                    Arguments.of(701, "ZY"),
                    Arguments.of(28, "AB"),
                    Arguments.of(703, "AAA")
            );
        }
    }
}
