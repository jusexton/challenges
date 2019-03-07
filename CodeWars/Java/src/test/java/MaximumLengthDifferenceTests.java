import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumLengthDifferenceTests {
    private static final String[] testArrayOne = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
    private static final String[] testArrayTwo = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};

    @Test
    public void testMxdiflgWithNoEmptyArrays() {
        testMxdiglfHelper(13, testArrayOne, testArrayTwo);
        testMxdiglfHelper(13, testArrayTwo, testArrayOne);
    }

    @Test
    public void testMxdiflgWithSecondArrayEmpty() {
        testMxdiglfHelper(-1, testArrayOne, new String[]{});
    }

    @Test
    public void testMxdiflgWithFirstArrayEmpty() {
        testMxdiglfHelper(-1, new String[]{}, testArrayTwo);
    }

    @Test
    public void testMkdiflgWithBothArraysEmpty() {
        testMxdiglfHelper(-1, new String[]{}, new String[]{});
    }

    private void testMxdiglfHelper(int expected, String[] a1, String[] a2) {
        final int actual = MaximumLengthDifference.mxdiflg(a1, a2);
        assertEquals(expected, actual);
    }
}
