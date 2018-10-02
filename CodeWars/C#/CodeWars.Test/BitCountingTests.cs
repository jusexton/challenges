using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class BitCountingTests
	{
		[Theory]
		[InlineData(0, 0)]
		[InlineData(1234, 5)]
		[InlineData(4, 1)]
		[InlineData(7, 3)]
		[InlineData(77231418, 14)]
		[InlineData(3811,8)]
		[InlineData(10030245, 10)]
		[InlineData(287, 6)]
		[InlineData(392902058, 17)]
		[InlineData(115370965, 15)]
		public void ShouldReturnNumberOfOnesInBinaryRepresentationOfInt(int number, int expected)
		{
			Assert.Equal(expected, BitCounting.CountBits(number));
		}
	}
}