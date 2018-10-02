using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class StringExtensionTests
	{
		[Theory]
		[InlineData("test", 1)]
		[InlineData("ths s _ strng wth n vwls", 0)]
		[InlineData("this is a slightly longer test string.", 8)]
		[InlineData("", 0)]
		public void ShouldReturnTheNumberOfVowelsInAGivenString(string input, int expected)
		{
			Assert.Equal(expected, input.GetVowelCount());
		}

		[Theory]
		[InlineData("", "")]
		[InlineData("a", "a")]
		[InlineData("to", "to")]
		[InlineData("the", "h")]
		[InlineData("test", "es")]
		public void ShouldReturnTheMiddleOfEvenAndOddLengthedStrings(string input, string expected)
		{
			Assert.Equal(expected, input.GetMiddle());
		}

		[Theory]
		[InlineData("", "", false)]
		[InlineData("a", "a", true)]
		[InlineData("tree", "etre", true)]
		[InlineData("test", "ttes", true)]
		[InlineData("hello", "llheo", true)]
		[InlineData("hello", "there", false)]
		[InlineData("should be", "false", false)]
		public void ShouldReturnIfPassedStringsAreAnagramsOfEachOther(string inputOne, string inputTwo, bool expected)
		{
			Assert.Equal(expected, inputOne.IsAnagramOf(inputTwo));
		}

		[Theory]
		[InlineData("", "")]
		[InlineData(
			"How can mirrors be real if our eyes aren't real",
			"How Can Mirrors Be Real If Our Eyes Aren't Real")]
		public void ShouldReturnJadenCasingOfGivenString(string input, string expected)
		{
			Assert.Equal(expected, input.ToJadenCase());
		}

		[Theory]
		[InlineData("bitcoin take over the world maybe who knows perhaps", 3)]
		[InlineData("turns out random test cases are easier than writing out basic ones", 3)]
		[InlineData("lets talk about javascript the best language", 3)]
		[InlineData("i want to travel the world writing code one day", 1)]
		[InlineData("Lets all go on holiday somewhere very cold", 2)]
		public void ShouldReturnTheLengthOfTheShortestWordInAGivenString(string input, int expected)
		{
			Assert.Equal(expected, input.ShortestWordLength());
		}
	}
}