import helpers.Bagel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BagelTests {
    @Test
    public void testBagel() {
        Bagel bagel = Bagels.getBagel();

        assertEquals(bagel.getValue() == 4, true);
    }

}
