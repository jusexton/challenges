using System;
using System.Numerics;

namespace SumOfDigits
{
	public static class Program
	{
		private static readonly (int, int)[] TestData =
		{
			(2, 1234),
			(11, 4000),
			(50, 3000)
		};

		private static void Main()
		{
			foreach (var tuple in TestData)
			{
				var number = BigInteger.Pow(tuple.Item1, tuple.Item2);
				Console.WriteLine(SumDigits(number.ToString()));
			}
		}

		private static int SumDigits(string value)
		{
			var sum = 0;
			foreach (var digit in value)
			{
				sum += digit - '0';
			}

			return sum;
		}
	}
}