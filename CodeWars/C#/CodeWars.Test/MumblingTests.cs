using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class MumblingTests
	{
		[Theory]
		[InlineData("", "")]
		[InlineData("abcd", "A-Bb-Ccc-Dddd")]
		[InlineData("RqaEzty", "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy")]
		[InlineData("cwAt", "C-Ww-Aaa-Tttt")]
		public void ShouldReturnTheCorrectMumbleForTheGivenInput(string input, string expected)
		{
			Assert.Equal(expected, Mumbling.Mumble(input));
		}
	}
}