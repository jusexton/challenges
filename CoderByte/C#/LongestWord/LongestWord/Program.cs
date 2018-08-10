using System;
using System.Linq;
using System.Text.RegularExpressions;

namespace LongestWord
{
	public static class Program
	{
		private static void Main()
		{
			Console.WriteLine(LongestWord(Console.ReadLine()));
		}

		private static string LongestWord(string sen)
		{
			return new Regex(@"[^a-zA-Z0-9 ]")
				.Replace(sen, "")
				.Split(" ")
				.OrderByDescending(word => word.Length)
				.First();
		}
	}
}