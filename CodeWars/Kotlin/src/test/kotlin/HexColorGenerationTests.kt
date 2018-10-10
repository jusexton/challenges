import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.collections.HashSet

@DisplayName("Hex Color Generation Tests")
internal class HexColorGenerationTests {
    @DisplayName("All generated color hexes should be valid")
    @Test
    fun allGeneratedColorHexesShouldBeValid() {
        generatedColors.map {
            assertEquals(true, isValidHexColorString(it), "$it was expected to be a valid hex color string")
        }
    }

    @DisplayName("Generated colors should be unique. (Most of the time)")
    @Test
    fun generatedColorHexesShouldBeUnique() {
        assertEquals(colorLimit, generatedColors.size, "")
    }

    private fun isValidHexColorString(str: String): Boolean = Regex("^#[0-9a-f]{6}$").matches(str)

    companion object {
        // Run tests on multiple generated hex strings in order to check random properties.
        private val generatedColors: HashSet<String> = HashSet()
        private const val colorLimit = 100
        val colors = generateSequence { generateColor(Random()) }

        @BeforeAll
        @JvmStatic
        internal fun setup() {
            generatedColors.addAll(colors.take(colorLimit))
        }
    }
}