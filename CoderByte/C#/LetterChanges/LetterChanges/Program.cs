using System;
using System.Linq;

namespace LetterChanges
{
	public static class Program
	{
		private static readonly int[] Vowels = {97, 101, 105, 111, 117};

		private static void Main()
		{
			Console.WriteLine(LetterChanges("abcdz"));
		}

		private static string LetterChanges(string str) =>
			new string(str.Select(ChangeLetter).ToArray());

		private static char ChangeLetter(char value)
		{
			if (value < 97 || value > 122)
			{
				return value;
			}

			char newValue;
			if (value == 122)
			{
				newValue = (char) 97;
			}
			else
			{
				newValue = (char) (value + 1);
			}

			foreach (var vowel in Vowels)
			{
				if (newValue == vowel)
				{
					newValue = (char) (vowel - 32);
				}
			}

			return newValue;
		}
	}
}