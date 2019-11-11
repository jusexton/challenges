using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
    public class BitCalculatorTests
    {
        [Theory]
        [InlineData("1", "1", 2)]
        [InlineData("10", "10", 4)]
        [InlineData("10", "0", 2)]
        [InlineData("10", "1", 3)]
        [InlineData("101", "10", 7)]
        public void ShouldReturnTheSumOfGivenBinaryNumbersInDecimal(string numberOne, string numberTwo, int expected)
        {
            Assert.Equal(expected, BitCalculator.Calculate(numberOne, numberTwo));
        }
    }
}