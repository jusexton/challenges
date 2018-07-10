using System;
using System.Linq;

namespace KnuthUpArrow
{
	public static class Program
	{
		private static readonly string[] TestExpressions =
		{
			"2^4",
			"2^^4",
			// "5^^^^5"
			"-1^^^3"
		};

		private static void Main() =>
			TestExpressions.Select(KnuthUpArrowCalculator.Calculate)
				.Select(number => number.ToString())
				.ToList()
				.ForEach(Console.WriteLine);
	}
}