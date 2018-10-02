using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class RangeExtractionTests
	{
		[Theory]
		[InlineData(
			new[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20},
			"-6,-3-1,3-5,7-11,14,15,17-20")]
		public void ShouldReturnTheCorrectlyExtractedRangeFromNumbers(int[] numbers, string expected)
		{
			Assert.Equal(expected, RangeExtraction.Extract(numbers));
		}
	}
}