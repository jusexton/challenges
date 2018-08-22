using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace WordFunnel
{
	public static class Program
	{
		private static void Main()
		{
			// Main Challenge
			Console.WriteLine(Funnel("reset", "rest"));

			// Bonus One
			var words = File.ReadAllLines("word-list.txt");
			Console.WriteLine(string.Join(", ", BonusOne("boats", words)));
		}

		private static bool Funnel(string wordOne, string wordTwo)
		{
			if (wordOne.Length - 1 != wordTwo.Length)
			{
				return false;
			}

			for (var i = 0; i < wordOne.Length; i++)
			{
				var funnelWord = wordOne.Substring(0, i) + wordOne.Substring(i + 1);
				if (funnelWord.Equals(wordTwo))
				{
					return true;
				}
			}

			return false;
		}

		private static IEnumerable<string> BonusOne(string word, IEnumerable<string> words)
			=> words.Where(w => Funnel(word, w));

		// TODO: Do BonusTwo
		// https://www.reddit.com/r/dailyprogrammer/comments/98ufvz/20180820_challenge_366_easy_word_funnel_1/
	}
}