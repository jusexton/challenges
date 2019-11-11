using System.Linq;

namespace CodeWars.Kata
{
	public static class TwoToOne
	{
		public static string Longest(string s1, string s2)
			=> string.Join("", (s1 + s2).Distinct().OrderBy(c => c));
	}
}