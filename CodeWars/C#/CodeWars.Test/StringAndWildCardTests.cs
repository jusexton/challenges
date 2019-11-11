using System.Linq;
using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
    public class StringAndWildCardTests
    {
        [Theory]
        [InlineData("101?", "1010", "1011")]
        [InlineData("1?1?", "1010", "1011", "1110", "1111")]
        [InlineData(
            "100010101010101???",
            "100010101010101000",
            "100010101010101001",
            "100010101010101010",
            "100010101010101011",
            "100010101010101100",
            "100010101010101101",
            "100010101010101110",
            "100010101010101111")]
        public void ShouldReturnAllPossibleOutComesGivenAString(string input, params string[] expected)
        {
            Assert.Equal(expected, StringAndWildCards.Possibilities(input).ToArray());
        }

        [Fact]
        public void ShouldReturnOriginalStringIfGivenInputDoesNotContainWildCards()
        {
            const string input = "1111";
            Assert.Equal(new[] {input}, StringAndWildCards.Possibilities(input));
        }
    }
}