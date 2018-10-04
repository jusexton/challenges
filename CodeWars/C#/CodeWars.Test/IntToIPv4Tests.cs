using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class IntToIPv4Tests
	{
		[Theory]
		[InlineData(0, "0.0.0.0")]
		[InlineData(2149583361, "128.32.10.1")]
		public void ShouldReturnTheCorrectIPv4GivenAnInteger(uint input, string expected)
		{
			Assert.Equal(expected, IntToIPv4.UInt32ToIP(input));
		}
	}
}