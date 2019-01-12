import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumEvenOrOddTests {
    @Test
    public void exampleTest() {
        assertEquals("even", SumEvenOrOdd.evenOrOdd(new int[]{}));
        assertEquals("odd", SumEvenOrOdd.evenOrOdd(new int[]{2, 5, 34, 6}));
        assertEquals("even", SumEvenOrOdd.evenOrOdd(new int[]{2, 6, 34, 10}));
    }
}
