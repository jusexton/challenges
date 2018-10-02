using System.Diagnostics.SymbolStore;
using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class LongExtensionTests
	{
		[Theory]
		[InlineData(0L, 0)]
		[InlineData(100L, 1)]
		[InlineData(123L, 6)]
		[InlineData(111111111111111111L, 18)]
		[InlineData(222222222222222222, 36)]
		public void ShouldReturnTheSumOfAnIntDigits(long input, int expected)
		{
			Assert.Equal(expected, input.SumDigits());
		}

		[Theory]
		[InlineData(-1, false)]
		[InlineData(0, true)]
		[InlineData(3, false)]
		[InlineData(4, true)]
		[InlineData(25, true)]
		[InlineData(26, false)]
		[InlineData(49, true)]
		[InlineData(144, true)]
		public void ShouldReturnWhetherAGivenNumberIsSquareOrNot(long number, bool expected)
		{
			Assert.Equal(expected, number.IsSquare());
		}
	}
}