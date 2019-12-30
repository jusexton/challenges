package com.sexton.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class GroupAnagrams {
    public static List<List<String>> groupAnagrams(final String[] strings) {
        final Map<Long, List<String>> groupings = Arrays.stream(strings).collect(Collectors.groupingBy(GroupAnagrams::stringXorValue));
        return new ArrayList<>(groupings.values());
    }

    private static long stringXorValue(final String s) {
        return s.chars().reduce(1, (a, b) -> a * b * 3);
    }
}
