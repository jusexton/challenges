import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Which Are In Tests")
internal class WhichAreInTests {
    @Test
    fun `should return array of strings that are substrings of other given array`() {
        val a2 = arrayOf("lively", "alive", "harp", "sharp", "armstrong")
        assertArrayEquals(arrayOf("live", "strong"), inArray(arrayOf("xyz", "live", "strong"), a2))
        assertArrayEquals(arrayOf("arp", "live", "strong"), inArray(arrayOf("live", "strong", "arp"), a2))
        assertArrayEquals(arrayOf<String>(), inArray(arrayOf("tarp", "mice", "bull"), a2))
    }
}