using System;
using System.Linq;
using System.Text.RegularExpressions;

namespace SimpleSymbols
{
	public static class Program
	{
		private static void Main()
		{
			Console.WriteLine(SimpleSymbols("f++d+"));
		}

		private static bool SimpleSymbols(string str) =>
			Regex.Matches(str, @"\+[a-z]\+").Count == str.Count(char.IsLetter);
	}
}