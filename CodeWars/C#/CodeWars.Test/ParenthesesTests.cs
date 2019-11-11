using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
    public class ParenthesesTests
    {
        [Theory]
        [InlineData("")]
        [InlineData("()")]
        [InlineData("()()")]
        [InlineData("(()())")]
        [InlineData("{()[]}")]
        public void ShouldReturnTrueWhenGivenValidStringOfPararentheses(string parentheses)
        {
            Assert.True(Parentheses.ValidParentheses(parentheses));
        }

        [Theory]
        [InlineData("(]")]
        [InlineData("(()()")]
        [InlineData("(()")]
        [InlineData("(")]
        public void ShouldReturnFalseWhenGivenInValidStringOfPararentheses(string parentheses)
        {
            Assert.False(Parentheses.ValidParentheses(parentheses));
        }
    }
}