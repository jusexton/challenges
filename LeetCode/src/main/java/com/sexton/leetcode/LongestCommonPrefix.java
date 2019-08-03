package com.sexton.leetcode;

import java.util.Arrays;
import java.util.List;

public final class LongestCommonPrefix {
    public static String longestCommonPrefix(final String... strings) {
        // No common prefix can exist if there are not at least two elements
        if (strings.length == 1) {
            return strings[0];
        } else if (strings.length == 0) {
            return "";
        }

        final List<String> stringList = Arrays.asList(strings);
        final StringBuilder commonPrefix = new StringBuilder(stringList.get(0));
        // Start at second element because we already have the first element
        for (int i = 1; i < stringList.size(); i++) {
            final String current = stringList.get(i);
            final int prefixLength = prefixLength(current, commonPrefix.toString());

            if (prefixLength == 0) {
                return "";
            }

            if (prefixLength > commonPrefix.length()) {
                final String addition = current.substring(commonPrefix.length(), prefixLength);
                commonPrefix.append(addition);
            } else {
                commonPrefix.setLength(prefixLength);
            }

            // If the prefix length is equal to the common prefix length no update needs to be made.
        }

        return commonPrefix.toString();
    }

    private static int prefixLength(final String stringOne, final String stringTwo) {
        final int minLength = Math.min(stringOne.length(), stringTwo.length());
        int i;
        for (i = 0; i < minLength; i++) {
            if (stringOne.charAt(i) != stringTwo.charAt(i)) {
                break;
            }
        }

        return i;
    }
}
