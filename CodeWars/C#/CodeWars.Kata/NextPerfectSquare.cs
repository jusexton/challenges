using System;

namespace CodeWars.Kata
{
	public class NextPerfectSquare
	{
		public static long FindNextSquare(long number)
		{
			var sqrt = Math.Sqrt(number);
			var isSquare = Math.Abs(sqrt % 1) < double.Epsilon;
			if (isSquare)
			{
				return Convert.ToInt64(Math.Pow(sqrt + 1, 2));
			}

			return -1;
		}
	}
}