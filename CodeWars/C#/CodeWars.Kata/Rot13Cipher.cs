using System;
using System.Text.RegularExpressions;

namespace CodeWars.Kata
{
	public static class Rot13Cipher
	{
		public static string Rot13Encode(string message)
		{
			var pattern = new Regex(@"[a-z]", RegexOptions.IgnoreCase);
			return pattern.Replace(message, new MatchEvaluator(Rot13EncodeShifter));
		}

		private static readonly Func<Match, string> Rot13EncodeShifter = letter
			=> ((char) (letter.Value[0] + (char.ToLower(letter.Value[0]) >= 'n' ? -13 : 13))).ToString();
	}
}