using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class ExtractFileNameTests
	{
		[Theory]
		[InlineData("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION", "FILE_NAME.EXTENSION")]
		[InlineData("1_This_is_an_otherExample.mpg.OTHEREXTENSIONadasdassdassds34", "This_is_an_otherExample.mpg")]
		[InlineData("1231231223123131_myFile.tar.gz2", "myFile.tar")]
		public void ShouldBeAbleToParseTheFileNameFromGivenMess(string input, string expected)
		{
			Assert.Equal(expected, FileNameExtraction.ExtractFileName(input));
		}
	}
}