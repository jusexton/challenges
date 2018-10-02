using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class FindNextSquareTests
	{
		[Theory]
		[InlineData(121, 144)]
		[InlineData(625, 676)]
		[InlineData(114, -1)]
		[InlineData(319225, 320356)]
		[InlineData(15241383936, 15241630849)]
		public void ShouldReturnTheNextPerfectSquareIfTheGivenIntIsAPerfectSquare(long input, long expected)
		{
			Assert.Equal(expected, NextPerfectSquare.FindNextSquare(input));
		}
	}
}