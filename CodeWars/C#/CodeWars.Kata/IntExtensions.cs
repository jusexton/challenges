using System.Collections.Generic;
using System.Linq;

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
	}
}