import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IpAddressCountingTests {
    @Test
    @DisplayName("Should return the number of ip address between two given ip addresses")
    public void testIpsBetween() {
        assertEquals(50, IpAddressCounting.ipsBetween("10.0.0.0", "10.0.0.50"));
        assertEquals(246, IpAddressCounting.ipsBetween("20.0.0.10", "20.0.1.0"));
    }
}
