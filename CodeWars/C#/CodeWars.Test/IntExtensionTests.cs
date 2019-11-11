using System.Collections.Generic;
using System.Numerics;
using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
    public class IntExtensionTests
    {
        [Theory]
        [InlineData(0, 0)]
        [InlineData(100, 1)]
        [InlineData(123, 6)]
        public void ShouldReturnTheSumOfAnIntDigits(int input, int expected)
        {
            Assert.Equal(expected, input.SumDigits());
        }

        [Theory]
        [InlineData(1, "1")]
        [InlineData(2, "2")]
        [InlineData(3, "6")]
        [InlineData(5, "120")]
        [InlineData(50, "30414093201713378043612608166064768844377641568960512000000000000")]
        [InlineData(100,
            "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000")]
        public void ShouldReturnTheCorrectFactorial(int value, string expected)
        {
            Assert.Equal(BigInteger.Parse(expected), value.Factorial());
        }

        [Theory]
        [InlineData(0, new[] {0})]
        [InlineData(10, new[] {1, 0})]
        [InlineData(123, new[] {1, 2, 3})]
        [InlineData(654634, new[] {6, 5, 4, 6, 3, 4})]
        public void ShouldReturnDigitsOfInteger(int value, IEnumerable<int> expected)
        {
            Assert.Equal(expected, value.GetDigits());
        }
    }
}