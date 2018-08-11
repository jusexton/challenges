using System;
using System.Text.RegularExpressions;

namespace LetterCapitalize
{
	public static class Program
	{
		private static void Main()
		{
			Console.WriteLine(LetterCapitalize("hello world"));
		}

		private static string LetterCapitalize(string str) =>
			Regex.Replace(str, @"(^\w)|(\s\w)", m => m.Value.ToUpper());
	}
}