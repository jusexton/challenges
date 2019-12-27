package com.sexton.leetcode;

public final class ReverseInteger {
    private ReverseInteger() {
        // Private constructor to stop instantiation
    }

    public static int reverseInteger(final int integer) {
        if (integer == 0) {
            return 0;
        }

        final String integerString;
        final String negativeValue;
        if (integer > 0) {
            integerString = String.valueOf(integer);
            negativeValue = "";
        } else {
            integerString = String.valueOf(integer).substring(1);
            negativeValue = "-";
        }

        final String reversedIntegerString = negativeValue + new StringBuilder(integerString).reverse();

        try {
            return Integer.parseInt(reversedIntegerString);
        } catch (final NumberFormatException ex) {
            // Number was too large to be converted to an integer.
            // Challenge specifies to just return 0
            return 0;
        }
    }
}
