using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
    public class CapitalizeVowelsTests
    {
        [Theory]
        [InlineData("Hello", "HEllO")]
        [InlineData("test", "tEst")]
        [InlineData("hola", "hOlA")]
        [InlineData("another test", "AnOthEr tEst")]
        public void ShouldReturnStringWithAllVowelsCapitalized(string input, string expected)
        {
            Assert.Equal(expected, CapitalizeVowels.Capitalize(input));
        }


        [Theory]
        [InlineData("", "")]
        public void ShoudlReturnGivenValueIfValueDoesNotContainVowels(string input, string expected)
        {
            Assert.Equal(expected, CapitalizeVowels.Capitalize(input));
        }
    }
}