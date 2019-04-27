import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseCodeDecoderTests {
    @Test
    public void shouldDecodeTheMorseCodeMessageCorrectly() {
        assertEquals("HEY JUDE", MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
    }

    @Test
    public void shouldDecodeSOSMessageCorrectly() {
        assertEquals("SOS", MorseCodeDecoder.decode("...---..."));
    }

    @Test
    public void shouldIgnoreWhiteSpaceUnlessSeparatingWords() {
        assertEquals("E E", MorseCodeDecoder.decode(" .   ."));
        assertEquals("E", MorseCodeDecoder.decode(" ."));
    }

    @Test
    public void shouldBeAbleToDecodePunctuation() {
        assertEquals("!", MorseCodeDecoder.decode("-.-.--"));
        assertEquals("HEY JUDE!", MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. . -.-.--"));
    }
}
