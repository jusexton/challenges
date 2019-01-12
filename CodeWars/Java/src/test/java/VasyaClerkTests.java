import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VasyaClerkTests {
    @Test
    @DisplayName("Should return YES if change can correctly be made.")
    public void testTheYesResultsOfTicketsMethod() {
        assertEquals("YES", VasyaClerk.tickets(new int[]{25, 25, 50}));
        assertEquals("YES", VasyaClerk.tickets(new int[] {25, 25, 25, 25, 50, 100, 50}));
    }

    @Test
    @DisplayName("Should return NO if change can not correctly be made.")
    public void testTheNoResultsOfTicketsMethod() {
        assertEquals("NO", VasyaClerk.tickets(new int[]{25, 100}));
        assertEquals("NO", VasyaClerk.tickets(new int[] {25, 25, 50, 50, 100}));
        assertEquals("NO", VasyaClerk.tickets(new int[] {25, 25, 25, 25, 25, 100, 100}));
    }
}
