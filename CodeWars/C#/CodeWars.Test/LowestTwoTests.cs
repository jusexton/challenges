using System.Collections.Generic;
using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
    public class LowestTwoTests
    {
        [Theory]
        [InlineData(new int[] { 5, 8, 12, 19, 22 }, 13)]
        public void ShouldReturnTheSumOfTheTwoLowestNumbers(IEnumerable<int> numbers, int expected)
        {
            Assert.Equal(expected, LowestTwo.SumTwoSmallestNumber(numbers));
        }
    }
}