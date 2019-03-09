using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
    public class RGBHexTests
    {
        [Theory]
        [InlineData(255, 255, 255, "FFFFFF")]
        [InlineData(255, 255, 300, "FFFFFF")]
        [InlineData(148, -20, 211, "9400D3")]
        [InlineData(212, 53, 12, "D4350C")]
        public void ShouldReturnTheHexConversionOfRGBValue(int r, int g, int b, string expected)
        {
            Assert.Equal(expected, RGBHex.Hex(r, g, b));
        }
    }
}