package com.sexton.leetcode;

public class ExcelSheetColumnNumber {
    /**
     * Imperative Style
     *
     * @param title The title that will be converted to number.
     * @return The resulting number that was converted from given title.
     */
    public static int imperativeTitleToNumber(final String title) {
        // If the title does not exist just return 0
        if (title == null || title.length() <= 0) {
            return 0;
        }

        int sum = 0;
        for (final char character : title.toCharArray()) {
            // Works only for uppercase characters
            final int charactersOrderInAlphabet = character - 64;
            sum = sum * 26 + charactersOrderInAlphabet;
        }

        return sum;
    }

    /**
     * Functional Style
     *
     * @param title The title that will be converted to number.
     * @return The resulting number that was converted from given title.
     */
    public static int functionalTitleToNumber(final String title) {
        return (title != null && title.length() > 0) ?
                title.chars()
                        .map(ascii -> ascii - 64)
                        .reduce(0, (acc, current) -> acc * 26 + current)
                : 0;
    }
}
