import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("A Plus B Tests")
internal class APlusBTests {
    @Test
    fun `a plus b should equal 123 when given is less than 123`() {
        doIntTest(0)
    }

    @Test
    fun `a plus b should equal 123 when given is equal to 123`() {
        doIntTest(123)
    }

    @Test
    fun `a plus b should equal 123 when given is greater than than 123`() {
        doIntTest(500)
    }

    private fun doIntTest(a: Int) {
        val b = Dinglemouse.int123(a)
        assertTrue(b >= 0)

        val expected = 123
        assertEquals(expected, (a + b).toInt())
    }
}
