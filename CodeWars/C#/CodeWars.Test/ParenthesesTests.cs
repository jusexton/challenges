using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class ParenthesesTests
	{
		[Theory]
		[InlineData("", true)]
		[InlineData("()", true)]
		[InlineData("()()", true)]
		[InlineData("(()())", true)]
		[InlineData("(()()", false)]
		[InlineData("(()", false)]
		[InlineData("(", false)]
		public void ShouldReturnWhetherGivenStringOfParenthesesIsFormattedCorrectly(string parentheses, bool expected)
		{
			Assert.Equal(expected, Parentheses.ValidParentheses(parentheses));
		}
	}
}