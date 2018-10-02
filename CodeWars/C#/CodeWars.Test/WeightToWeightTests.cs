using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class WeightToWeightTests
	{
		[Theory]
		[InlineData("103 123 4444 99 2000", "2000 103 123 4444 99")]
		// Test is failing do to incorrect handling of equal value weights
		[InlineData("2000 10003 1234000 44444444 9999 11 11 22 123", "11 11 2000 10003 22 123 1234000 44444444 9999")]
		public void ShouldReturnTheCorrectlySortedListOfWeightsAsAString(string input, string expected)
		{
			Assert.Equal(expected, WeightToWeight.OrderWeight(input));
		}
	}
}