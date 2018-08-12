using System;
using System.Linq;

namespace AlphabetSoup
{
	public static class Program
	{
		private static void Main()
		{
			Console.WriteLine(AlphabetSoup("hello"));
		}

		private static string AlphabetSoup(string str) => string.Join("", str.OrderBy(c => c));
	}
}