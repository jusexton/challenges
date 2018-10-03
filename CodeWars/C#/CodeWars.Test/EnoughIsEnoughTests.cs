using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class EnoughIsEnoughTests
	{
		[Theory]
		[InlineData(new[] {20, 37, 20, 21}, 1, new[] {20, 37, 21})]
		[InlineData(new[] {1, 1, 3, 3, 7, 2, 2, 2, 2}, 3, new[] {1, 1, 3, 3, 7, 2, 2, 2})]
		public void ShouldReturnTheCorrectlyFilteredListGivenN(int[] numbers, int n, int[] expected)
		{
			Assert.Equal(expected, EnoughIsEnough.DeleteNthOccurrence(numbers, n));
		}
	}
}