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
	}
}