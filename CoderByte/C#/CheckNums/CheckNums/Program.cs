using System;

namespace CheckNums
{
	public static class Program
	{
		private static void Main()
		{
			Console.WriteLine(CheckNums(6, 6));
		}

		private static string CheckNums(int numOne, int numTwo)
		{
			if (numTwo > numOne)
			{
				return "true";
			}

			return numTwo < numOne ? "false" : "-1";
		}
	}
}