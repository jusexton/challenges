import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DubstepTests {
    @Test
    @DisplayName("Should return the song without the wub strings and correctly formatted")
    public void testSongDecoder() {
        assertEquals("ABC", new Dubstep().songDecoder("WUBWUBABCWUB"));
        assertEquals("R L", new Dubstep().songDecoder("RWUBWUBWUBLWUB"));
    }
}
