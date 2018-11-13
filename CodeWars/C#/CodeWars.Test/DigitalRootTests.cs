using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class DigitalRootTests
	{
		[Theory]
		[InlineData(16L, 7)]
		[InlineData(942L, 6)]
		[InlineData(132189L, 6)]
		[InlineData(493193L, 2)]
		public void ShouldReturnTheCorrectDigitalRoot(long value, int expected)
		{
			Assert.Equal(expected, DigitalRoot.CalculateDigitalRoot(value));
		}
	}
}