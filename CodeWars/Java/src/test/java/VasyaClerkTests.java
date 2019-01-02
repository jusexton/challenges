import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VasyaClerkTests {
    @Test
    public void test1() {
        assertEquals("YES", VasyaClerk.tickets(new int[]{25, 25, 50}));
        assertEquals("NO", VasyaClerk.tickets(new int[]{25, 100}));
        assertEquals("NO", VasyaClerk.tickets(new int[] {25, 25, 50, 50, 100}));
        assertEquals("YES", VasyaClerk.tickets(new int[] {25, 25, 25, 25, 50, 100, 50}));
        assertEquals("NO", VasyaClerk.tickets(new int[] {25, 25, 25, 25, 25, 100, 100}));
    }
}
