using System;
using System.Numerics;
using System.Text.RegularExpressions;

namespace KnuthUpArrow
{
	// TODO: Allow calculator to be able to handle much larger numbers.
	public class KnuthUpArrowCalculator
	{
		// TODO: Allow negative number to be passed in expression.
		private const string ParseString = @"^(?<a>([0-9]|[1-9][0-9]))(?<arrows>\^+)(?<b>([0-9]|[1-9][0-9]))$";

		public static BigInteger Calculate(string expression)
		{
			var matchResult = new Regex(ParseString).Match(expression);

			if (!matchResult.Success)
			{
				throw new ArgumentException("expression not formatted correctly", nameof(expression));
			}

			var a = Convert.ToInt32(matchResult.Groups["a"].Value);
			var b = Convert.ToInt32(matchResult.Groups["b"].Value);
			var arrowCount = matchResult.Groups["arrows"].Value.Length;
			return Calculate(a, b, arrowCount);
		}

		public static int Calculate(int a, int b, int arrowCount)
		{
			if (arrowCount == 1)
			{
				return Convert.ToInt32(Math.Pow(a, b));
			}

			if (arrowCount >= 1 && b == 0)
			{
				return 1;
			}

			// ReSharper disable once TailRecursiveCall
			return Calculate(a, Calculate(a, b - 1, arrowCount), arrowCount - 1);
		}
	}
}