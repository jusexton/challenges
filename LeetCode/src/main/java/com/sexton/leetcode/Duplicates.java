package com.sexton.leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 */
public final class Duplicates {
    /**
     * @param numbers
     * @return
     */
    public static boolean containsDuplicate(final int[] numbers) {
        if (numbers.length <= 1) {
            return false;
        }

        final int originalLength = numbers.length;
        final Set<Integer> numberSet = Arrays.stream(numbers).boxed().collect(Collectors.toSet());
        return numberSet.size() != originalLength;
    }
}
