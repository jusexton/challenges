using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class EqualArraySplitTests
	{
		[Theory]
		[InlineData(new[] {5, 5, 5}, 1)]
		[InlineData(new[] {1, 100, 50, -51, 1, 1}, 1)]
		[InlineData(new[] {1, 2, 3, 4, 3, 2, 1}, 3)]
		[InlineData(new[] {15, 15, 3, 30}, 2)]
		[InlineData(new[] {1, 2, 3, 4, 5, 6}, -1)]
		[InlineData(new[] {10, -80, 10, 10, 15, 35}, 0)]
		public void ShouldReturnTheIndexAtWhichBothSubsetsOnEachSideEqualEachOther(int[] numbers, int expected)
		{
			Assert.Equal(expected, EqualArraySplit.FindEqualSplitIndex(numbers));
		}
	}
}