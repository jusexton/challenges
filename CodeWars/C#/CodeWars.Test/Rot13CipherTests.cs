using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class Rot13CipherTests
	{
		[Theory]
		[InlineData("test", "grfg")]
		[InlineData("Test", "Grfg")]
		[InlineData("Codewars", "Pbqrjnef")]
		[InlineData("C# is cool!", "P# vf pbby!")]
		[InlineData("10+2 is twelve.", "10+2 vf gjryir.")]
		[InlineData("abcdefghijklmnopqrstuvwxyz", "nopqrstuvwxyzabcdefghijklm")]
		public void ShouldReturnCorrectEncodedTextForGivenInput(string input, string expected)
		{
			Assert.Equal(expected, Rot13Cipher.Rot13Encode(input));
		}
	}
}