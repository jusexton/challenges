using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class PascalToSnakeTests
	{
		[Theory]
		[InlineData("TestController", "test_controller")]
		[InlineData("MoviesAndBooks", "movies_and_books")]
		public void ShouldReturnTheCorrectlyConvertedStringToSnakeCase(string input, string expected)
		{
			Assert.Equal(expected, PascalToSnake.ToSnakeCase(input));
		}
	}
}