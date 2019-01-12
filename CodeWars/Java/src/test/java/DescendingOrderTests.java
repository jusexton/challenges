import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DescendingOrderTests {
    @Test
    @DisplayName("Should return a new integer with its digits sorted in a descending order")
    public void testSortDescending() {
        assertEquals(0, DescendingOrder.sortDesc(0));
        assertEquals(51, DescendingOrder.sortDesc(15));
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }
}
