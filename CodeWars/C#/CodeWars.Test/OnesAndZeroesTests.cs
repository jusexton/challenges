using System.Collections.Generic;
using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
    public class OnesAndZeroesTests
    {
        [Theory]
        [InlineData(new int[] { 0, 0, 0, 1 }, 1)]
        public void ShouldReturnIntegerGivenArrayOfBits(IEnumerable<int> bits, int expected)
        {
            Assert.Equal(expected, OnesAndZeroes.BinaryToInt32(bits));
        }
    }
}