using System.Text.RegularExpressions;

namespace CodeWars.Kata
{
    public static class CapitalizeVowels
    {
        public static readonly Regex IsVowel = new Regex(@"[aeiou]");

        public static string Capitalize(string s) => IsVowel.Replace(s, (match) => match.Value.ToUpper());
    }
}