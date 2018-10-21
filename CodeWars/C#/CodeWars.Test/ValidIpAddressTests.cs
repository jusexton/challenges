using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class ValidIpAddressTests
	{
		[Theory]
		[InlineData("255", false)]
		[InlineData("505", false)]
		[InlineData("266.266.266.266", false)]
		[InlineData("-1.5.255.-0", false)]
		[InlineData("abc.abc.abc.abc", false)]
		[InlineData("a.5.255.50", false)]
		[InlineData("1.2.3.4", true)]
		[InlineData("123.123.123.123", true)]
		[InlineData("0.0.0.0", true)]
		[InlineData("255.255.255.255", true)]
		public void ShouldReturnTrueWhenGivenValidIpAddressFalseOtherwise(string ip, bool expected)
		{
			Assert.Equal(expected, ValidIpAddress.IsValidIp(ip));
		}
	}
}