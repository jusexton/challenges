using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;

namespace CodeWars.Kata
{
	public static class StringAndWildCards
	{
		private static readonly Regex WildCardRegex = new Regex(@"\?");

		public static IEnumerable<string> Possibilities(string str)
		{
			var matches = WildCardRegex.Matches(str);

			// String does not contain wild card characters.
			if (matches.Count == 0)
			{
				return new[] {str}.AsEnumerable();
			}

			return Permutations(matches.Count)
				.Select(permutation =>
				{
					var stringBuilder = new StringBuilder(str);
					for (var i = 0; i < matches.Count; i++)
					{
						stringBuilder[matches[i].Index] = permutation[i];
					}

					return stringBuilder.ToString();
				});
		}

		/// <summary>
		/// Generates permutations of 1's and 0's with duplicates given a certain length
		/// </summary>
		/// <param name="length">The length of each permutation</param>
		/// <returns>Enumerable of all the permutations</returns>
		/// <exception cref="InvalidOperationException">Thrown when length is less than or equal to zero</exception>
		private static IEnumerable<string> Permutations(int length)
		{
			if (length <= 0)
			{
				throw new InvalidOperationException("Length must be greater than zero");
			}

			var maxNumber = (int) Math.Ceiling(Math.Pow(2, length));
			return Enumerable.Range(0, maxNumber)
				.Select(number => Convert.ToString(number, 2).PadLeft(length, '0'));
		}
	}
}