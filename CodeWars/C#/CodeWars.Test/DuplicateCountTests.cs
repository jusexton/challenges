using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class DuplicateCountTests
	{
		[Theory]
		[InlineData("abcd", 0)]
		[InlineData("aabb", 2)]
		[InlineData("aabbcde", 2)]
		[InlineData("aabBcde", 2)]
		[InlineData("indivisibility", 1)]
		[InlineData("Indivisibilities", 2)]
		[InlineData("aA11", 2)]
		[InlineData("ABAB", 2)]
		public void ShouldReturnTheNumberOfDuplicateCharactersInAGivenString(string input, int expected)
		{
			Assert.Equal(expected, CountingDuplicates.DuplicateCount(input));
		}
	}
}