using System.Text;
using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class StringBuilderExtensionTests
	{
		[Theory]
		[InlineData(1, 1, ",", "1")]
		[InlineData(1, 3, ",", "1-3")]
		[InlineData(1, 2, ",", "1,2")]
		[InlineData(-1, 7, ",", "-1-7")]
		public void ShouldAppendIntRangeInCorrectStringFormat(int start, int end, string delimiter, string expected)
		{
			var actual = new StringBuilder().AppendRange(delimiter, start, end).ToString();
			Assert.Equal(expected, actual);
		}
	}
}