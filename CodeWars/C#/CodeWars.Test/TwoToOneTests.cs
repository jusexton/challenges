using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class TwoToOneTests
	{
		[Theory]
		[InlineData("", "", "")]
		[InlineData("ab", "cdd", "abcd")]
		[InlineData("cdd", "ab", "abcd")]
		[InlineData("xyaabbbccccdefww", "xxxxyyyyabklmopq", "abcdefklmopqwxy")]
		public void ShouldReturnTheOrderedDistinctCharactersOfBothStrings(string strOne, string strTwo, string expected)
		{
			Assert.Equal(expected, TwoToOne.Longest(strOne, strTwo));
		}
	}
}