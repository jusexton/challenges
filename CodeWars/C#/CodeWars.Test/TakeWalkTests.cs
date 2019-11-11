using System;
using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
    public class TakeWalkTests
    {
        [Theory]
        [InlineData(null, false)]
        [InlineData(new[] {"e"}, false)]
        [InlineData(new[] {"n", "s", "n", "s", "n", "s", "n", "s", "n", "s"}, true)]
        [InlineData(new[] {"e", "w", "e", "w", "n", "s", "n", "s", "e", "w"}, true)]
        [InlineData(new[] {"n", "s", "e", "w", "n", "s", "e", "w", "n", "s"}, true)]
        [InlineData(new[] {"n", "s", "e", "w", "n", "s", "e", "w", "n", "s", "e", "w", "n", "s", "e", "w"}, false)]
        public void ShouldCorrectlyReturnIfAGivenWalkIsValidOrNot(string[] walk, bool expected)
        {
            Assert.Equal(expected, TakeWalk.IsValidWalk(walk));
        }

        [Fact]
        public void ShouldThrowArgumentNotValidExceptionWhenGivenInvalidDirection()
        {
            var walkDirections = new[] {"n", "s", "n", "s", "a", "s", "n", "b", "n", "s"};
            Assert.Throws<ArgumentOutOfRangeException>(() => TakeWalk.IsValidWalk(walkDirections));
        }
    }
}