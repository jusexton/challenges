using System;

namespace LongestWord
{
	public static class Program
	{
		private static void Main()
		{
			Console.WriteLine(Factorial(Convert.ToInt32(Console.ReadLine())));
		}

		public static int Factorial(int num)
		{
			if (num >= 1)
			{
				return num * Factorial(num - 1);
			}

			return 1;
		}
	}
}