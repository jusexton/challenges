import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTheDigitTests {
    @Test
    public void test() {
        assertEquals(4700, CountTheDigit.nbDig(5750, 0));
        assertEquals(9481, CountTheDigit.nbDig(11011, 2));
        assertEquals(7733, CountTheDigit.nbDig(12224, 8));
        assertEquals(11905, CountTheDigit.nbDig(11549, 1));
    }
}
