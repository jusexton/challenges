using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class EnumerableExtensionTests
	{
		[Theory]
		[InlineData(new object[] {1, 2}, new object[] {1}, new object[] {2})]
		[InlineData(new object[] {1, 2, 3}, new object[] {1, 2, 4}, new object[] {3, 4})]
		[InlineData(new object[] {1, 2, 2, 2, 3}, new object[] {2}, new object[] {1, 3})]
		[InlineData(new object[] {"test", "strings"}, new object[] {"test"}, new object[] {"strings"})]
		[InlineData(new object[] {1.5, 3.5, 6.7}, new object[] {3.5}, new object[] {1.5, 6.7})]
		public void ShouldReturnTheDifferenceBetweenTwoGivenLists(
			object[] inputOne, object[] inputTwo, object[] expected)
		{
			Assert.Equal(expected, inputOne.Difference(inputTwo));
		}

		[Theory]
		[InlineData(new int[] { }, 0)]
		[InlineData(new[] {5}, 5)]
		[InlineData(new[] {1, 2, 3}, 6)]
		[InlineData(new[] {5, 5, 3}, 75)]
		public void ShouldReturnCorrectProductOfEntireEnumerable(int[] numbers, int expected)
		{
			Assert.Equal(expected, numbers.Product());
		}

		[Theory]
		[InlineData("abba", new [] {"aabb", "abcd", "bbaa", "dada"}, new [] { "aabb", "bbaa"})]
		public void ShouldReturnAnagramsOfAGivenStringAndList(string input, string[] values, string[] expected)
		{
			Assert.Equal(expected, values.AnagramsOf(input));
		}
	}
}