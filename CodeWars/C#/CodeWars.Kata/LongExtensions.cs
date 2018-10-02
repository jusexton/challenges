using System;

namespace CodeWars.Kata
{
	public static class LongExtensions
	{
		public static int SumDigits(this long value)
		{
			var sum = 0L;
			while (value > 0)
			{
				sum += value % 10;
				value /= 10;
			}

			return (int) sum;
		}
		
		public static bool IsSquare(this long n) => Math.Abs(Math.Sqrt(n) % 1) < double.Epsilon;
	}
}