using System;
using System.Collections.Generic;
using System.Linq;

namespace CodeWars.Kata
{
	public static class LongExtensions
	{
		public static int SumDigits(this long value) => value.GetDigits().Sum();

		public static IEnumerable<int> GetDigits(this long value)
		{
			var digitStack = new Stack<int>();
			while (value > 0)
			{
				digitStack.Push(Convert.ToInt32(value % 10));
				value /= 10;
			}

			return digitStack.Reverse();
		}
		
		public static bool IsSquare(this long n) => Math.Abs(Math.Sqrt(n) % 1) < double.Epsilon;
	}
}