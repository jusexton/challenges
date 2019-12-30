package com.sexton.leetcode.util;

import java.util.Random;
import java.util.function.Supplier;

public class RandomStringSupplier implements Supplier<String> {
    private int stringLength;
    private Random random;

    public RandomStringSupplier(int stringLength) {
        this.stringLength = stringLength;
        this.random = new Random();
    }

    @Override
    public String get() {
        return random.ints(this.stringLength, 32, 127)
                .mapToObj(n -> (char) n)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
