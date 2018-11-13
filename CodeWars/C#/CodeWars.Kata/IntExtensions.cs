using System.Collections.Generic;
using System.Linq;
using System.Numerics;

namespace CodeWars.Kata
{
	public static class IntExtensions
	{
		public static int SumDigits(this int value) => value.GetDigits().Sum();

		public static IEnumerable<int> GetDigits(this int value)
		{
			var digitStack = new Stack<int>();
			while (value > 0)
			{
				digitStack.Push(value % 10);
				value /= 10;
			}

			return digitStack.Reverse();
		}

		/// <summary>
		/// Returns the factorial of a value in the form of a BigInteger
		/// </summary>
		/// <param name="value"></param>
		/// <returns>The calculated factorial</returns>
		public static BigInteger Factorial(this int value)
		{
			// This function does not make use of recursion in order to
			// stay away from stack overflow exceptions.
			BigInteger sum = value;
			BigInteger result = value;
			for (var i = value - 2; i > 1; i -= 2)
			{
				sum += i;
				result *= sum;
			}

			if (value % 2 != 0)
			{
				result *= value / 2 + 1;
			}

			return result;
		}
	}
}