using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class EvenOrOddTests
	{
		private const string EvenString = "Even";
		private const string OddString = "Odd";

		[Theory]
		[InlineData(0, EvenString)]
		[InlineData(2, EvenString)]
		[InlineData(6, EvenString)]
		[InlineData(235438, EvenString)]
		[InlineData(1, OddString)]
		[InlineData(5, OddString)]
		[InlineData(12432647, OddString)]
		public void ShouldReturnEvenWhenPassedValueIsEvenAndOddWithValuePassedIsOdd(int value, string expected)
		{
			Assert.Equal(expected, EvenOrOdd.EvenOdd(value));
		}
	}
}