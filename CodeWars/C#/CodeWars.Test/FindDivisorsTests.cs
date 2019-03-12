using System.Collections.Generic;
using System.Linq;
using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
    public class FindDivisorsTests
    {
        [Theory]
        [InlineData(6, new int[] { 2, 3 })]
        [InlineData(10, new int[] { 2, 5 })]
        [InlineData(15, new int[] { 3, 5 })]
        [InlineData(11, new int[] { })]
        [InlineData(16, new int[] { 2, 4, 8 })]
        public void ShouldReturnAllDivisorsForGivenNumber(int value, IEnumerable<int> expected)
        {
            Assert.Equal(expected, FindDivisors.Find(value));
        }
    }
}