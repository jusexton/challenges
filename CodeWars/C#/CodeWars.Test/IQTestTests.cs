using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
    public class IQTestTests
    {
        [Theory]
        [InlineData("1 2 2 2 2", 1)]
        [InlineData("4 6 8 10 1", 5)]
        [InlineData("2 2 2 1", 4)]
        [InlineData("1 1 1 1 1 1 1 1 1 5 6", 11)]
        [InlineData("1 1 1 1 1 4 1 1 1 1", 6)]
        public void ShouldReturnTheCorrectIPv4GivenAnInteger(string input, int expected)
        {
            Assert.Equal(expected, IQTest.Test(input));
        }
    }
}