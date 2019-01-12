import helpers.Bagel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BagelTests {
    @Test
    @Disabled("Worked on CodeWars but not locally")
    public void testBagel() {
        Bagel bagel = Bagels.getBagel();

        assertEquals(4, bagel.getValue());
    }

}
