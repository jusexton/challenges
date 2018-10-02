using System.Globalization;
using System.Linq;
using System.Text.RegularExpressions;

namespace CodeWars.Kata
{
	public static class StringExtensions
	{
		private static readonly Regex NotVowelRegex = new Regex(@"[^aeiou]");

		public static int GetVowelCount(this string str) => NotVowelRegex.Replace(str, "").Length;

		public static string GetMiddle(this string str)
		{
			if (string.IsNullOrEmpty(str))
			{
				return "";
			}

			var middle = str.Length / 2;
			return str.Length % 2 == 0 ? str.Substring(middle - 1, 2) : str.Substring(middle, 1);
		}

		public static bool IsAnagramOf(this string str, string other)
		{
			if (string.IsNullOrEmpty(str) || string.IsNullOrEmpty(other))
			{
				return false;
			}

			if (str.Length != other.Length)
			{
				return false;
			}

			var thisOrdered = string.Join("", str.OrderBy(c => c));
			var otherOrdered = string.Join("", other.OrderBy(c => c));
			return thisOrdered.Equals(otherOrdered);
		}
		
		public static string ToJadenCase(this string phrase)
			=> new CultureInfo("en-US", false).TextInfo.ToTitleCase(phrase.ToLower());
		
		public static int ShortestWordLength(this string str) 
			=> str.Split(" ").Select(word => word.Length).Min();
	}
}