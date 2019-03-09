import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookSellerTests {
    @Test
    public void testStockSummary() {
        String[] library = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String[] matches = new String[]{"A", "B"};
        assertEquals("(A : 200) - (B : 1140)", BookSeller.stockSummary(library, matches));
    }

    @Test
    public void testStockSummaryWithZeroMatches() {
        String[] library = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String[] matches = new String[]{};
        assertEquals("", BookSeller.stockSummary(library, matches));
    }
}
