using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class BigNumberAdditionTests
	{
		[Theory]
		[InlineData("100", "0", "100")]
		[InlineData("123", "123", "246")]
		[InlineData("0", "0", "0")]
		[InlineData("-1", "-100", "-101")]
		public void ShouldReturnTheValueOfTwoAddedIntegersInStringForm(string a, string b, string expected)
		{
			Assert.Equal(expected, BigNumberAddition.Add(a, b));
		}
	}
}