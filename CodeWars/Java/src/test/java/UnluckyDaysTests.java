import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnluckyDaysTests {
    @Test
    public void testUnluckyDays() {
        assertEquals(3, UnluckyDays.unluckyDays(2015));
        assertEquals(1, UnluckyDays.unluckyDays(1986));
        assertEquals(2, UnluckyDays.unluckyDays(4017));
    }
}
