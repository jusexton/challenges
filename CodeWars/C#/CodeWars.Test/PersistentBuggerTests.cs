using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class PersistentBuggerTests
	{
		[Theory]
		[InlineData(39L, 3)]
		[InlineData(999L, 4)]
		public void ShouldReturnTheCorrectCountOfDigitsThatMustBeMultipliedToReachLessThanTwoDigits(long value,
			int expected)
		{
			Assert.Equal(expected, PersistentBugger.Persistence(value));
		}
	}
}