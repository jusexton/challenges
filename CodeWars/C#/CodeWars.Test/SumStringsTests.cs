using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class SumStringsTests
	{
		[Theory]
		[InlineData("", "", "0")]
		[InlineData("0", null, "0")]
		[InlineData(null, null, "0")]
		[InlineData(null, "0", "0")]
		[InlineData("", "0", "0")]
		[InlineData("-1", "0", "-1")]
		[InlineData("0", "0", "0")]
		[InlineData("1", "2", "3")]
		[InlineData("1000", "2000", "3000")]
		public void ShouldReturnTheSumOfTwoIntegersGivenAsStrings(string stringOne, string stringTwo, string expected)
		{
			Assert.Equal(expected, SumStrings.Sum(stringOne, stringTwo));
		}
	}
}