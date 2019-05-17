import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Unwanted Dollars Tests")
internal class UnwantedDollarsTests {
    @Test
    fun `should give money value when no symbols are included`() {
        assertEquals(12.0, UnwantedDollars.moneyValue("12"))
        assertEquals(0.0, UnwantedDollars.moneyValue("0"))
    }

    @Test
    fun `should give back zero when string is blank`() {
        assertEquals(0.0, UnwantedDollars.moneyValue(""))
    }

    @Test
    fun `should be able to handle only decimal values`() {
        assertEquals(0.0, UnwantedDollars.moneyValue(".0"))
        assertEquals(0.15, UnwantedDollars.moneyValue(".15"))
        assertEquals(0.99, UnwantedDollars.moneyValue(".99"))
    }

    @Test
    fun `should be able to handle floating point values`() {
        assertEquals(2.0, UnwantedDollars.moneyValue("2.0"))
        assertEquals(2.15, UnwantedDollars.moneyValue("2.15"))
        assertEquals(0.99, UnwantedDollars.moneyValue("0.99"))
        assertEquals(15.99, UnwantedDollars.moneyValue("15.99"))
    }

    @Test
    fun `should be able to handle negative values`() {
        assertEquals(-2.0, UnwantedDollars.moneyValue("-2.0"))
        assertEquals(-2.15, UnwantedDollars.moneyValue("-2.15"))
        assertEquals(-0.99, UnwantedDollars.moneyValue("-0.99"))
        assertEquals(-15.99, UnwantedDollars.moneyValue("-15.99"))
    }

    @Test
    fun `should give only money value when dollar symbol is present`() {
        assertEquals(12.0, UnwantedDollars.moneyValue("$12"))
        assertEquals(0.0, UnwantedDollars.moneyValue("$0"))
    }

    @Test
    fun `should give negative value back when dollar symbol is before negative sign`() {
        assertEquals(-12.0, UnwantedDollars.moneyValue("-$12"))
        assertEquals(-1.55, UnwantedDollars.moneyValue("-$1.55"))
    }

    @Test
    fun `should be able to ignore whitespace`() {
        assertEquals(-0.10, UnwantedDollars.moneyValue("-$ 0.1"))
    }
}