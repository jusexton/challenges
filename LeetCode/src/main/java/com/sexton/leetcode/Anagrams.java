package com.sexton.leetcode;

import java.util.Arrays;

/**
 *
 */
public final class Anagrams {
    private Anagrams() {
        // Stop instantiation
    }

    /**
     * @param stringOne
     * @param stringTwo
     * @return
     */
    public static boolean isAnagram(final String stringOne, final String stringTwo) {
        if (stringOne.length() != stringTwo.length()) {
            return false;
        }

        final String sortedStringOne = getSortedString(stringOne);
        final String sortedStringTwo = getSortedString(stringTwo);

        return sortedStringOne.equals(sortedStringTwo);
    }

    /**
     * @param s
     * @return
     */
    private static String getSortedString(final String s) {
        final char[] characters = s.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }

    public static boolean isAnagramOptimized(final String stringOne, final String stringTwo) {
        if (stringOne.length() != stringTwo.length()) {
            return false;
        }

        // int value = 0;
        // for (int i = 0; i < stringOne.length(); i++) {
        //     value = value ^ (int) stringOne.charAt(i);
        //     value = value ^ (int) stringTwo.charAt(i);
        // }

        return (stringOne + stringTwo).chars().reduce(0, (a, b) -> a ^ b) == 0;
    }
}
