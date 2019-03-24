import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOppositeNumber {
    @Test
    public void testGetOppositeWithZero() {
        assertEquals(0, OppositeNumber.getOpposite(0));
    }

    @Test
    public void testGetOppositeWithPositiveNumbers() {
        assertEquals(-5, OppositeNumber.getOpposite(5));
        assertEquals(-10, OppositeNumber.getOpposite(10));
        assertEquals(-500, OppositeNumber.getOpposite(500));
        assertEquals(-1, OppositeNumber.getOpposite(1));
    }

    @Test
    public void testGetOppositeWithNegativeNumbers() {
        assertEquals(5, OppositeNumber.getOpposite(-5));
        assertEquals(10, OppositeNumber.getOpposite(-10));
        assertEquals(500, OppositeNumber.getOpposite(-500));
        assertEquals(1, OppositeNumber.getOpposite(-1));
    }
}
