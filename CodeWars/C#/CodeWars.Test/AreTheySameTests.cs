using CodeWars.Kata;
using Xunit;

namespace CodeWars.Test
{
	public class AreTheySameTests
	{
		[Theory]
		[InlineData(
			new int[] {},
			new int[] {},
			true)]
		[InlineData(
			null,
			null,
			false)]
		[InlineData(
			new [] {1, 2, 3},
			new [] {1, 4, 9},
			true)]
		[InlineData(
			new [] {121, 144, 19, 161, 19, 144, 19, 11},
			new [] {121, 14641, 20736, 361, 25921, 361, 20736, 361},
			true)]
		public void ShouldDisplayIfOneOfTwoGivenArraysIsTheSquaresOfTheOther(int[] arrayOne, int[] arrayTwo, bool expected)
		{
			Assert.Equal(expected, AreTheySame.Compute(arrayOne, arrayTwo));
		}
	}
}