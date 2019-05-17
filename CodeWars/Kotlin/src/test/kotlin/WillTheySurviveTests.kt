import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Will They Survive Tests")
internal class WillTheySurviveTests {
    @Test
    fun `hero should not survive if they do not have enough bullets to kill all the dragons`() {
        assertFalse(hero(0, 5))
        assertFalse(hero(1, 1))
        assertFalse(hero(9, 5))
    }

    @Test
    fun `hero should survive if they have enough bullets to kill all the dragons`() {
        assertTrue(hero(2, 1))
        assertTrue(hero(1000, 5))
        assertTrue(hero(10000, 5000))
    }

    @Test
    fun `hero should survive if there are no dragons`() {
        assertTrue(hero(-100, 0))
    }
}