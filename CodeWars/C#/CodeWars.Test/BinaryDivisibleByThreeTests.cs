using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class BinaryDivisibleByThreeTests
	{
		[Theory]
		[InlineData("110", true)]
		[InlineData("000", true)]
		[InlineData("011", true)]
		[InlineData("001", false)]
		[InlineData("0011", true)]
		[InlineData("00101111101", true)]
		[InlineData("1110111100110100", true)]
		[InlineData(null, false)]
		[InlineData("", false)]
		[InlineData("abc", false)]
		public void ShouldReturnWhetherGivenBinaryIsDivisibleByThreeOrNot(string binary, bool expected)
		{
			Assert.Equal(expected, BinaryDivisibleByThree.IsDivisibleByThree(binary));
		}
	}
}