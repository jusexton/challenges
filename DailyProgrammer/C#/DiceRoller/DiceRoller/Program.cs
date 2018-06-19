using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace DiceRoller
{
	public static class Program
	{
		private const string ParsePattern = @"(?<diceCount>\d+)d(?<faceCount>\d+)";
		private static readonly Random Random = new Random();

		private static void Main(string[] args)
		{
			var result = Parse(args[0]);

			// Optimized dice rolls but bonus cannot be done with his method.
			// var summedDice = RollDie(result.DiceCount * result.FaceCount);
			// Console.WriteLine(summedDice);

			var diceRolls = RollDice(result.DiceCount, result.FaceCount).ToArray();
			var joinedRolls = string.Join(", ", diceRolls);
			Console.WriteLine($"{diceRolls.Sum()} : {joinedRolls}");
		}

		private static long RollDie(long faceCount) => Random.NextLong(1, faceCount);

		private static IEnumerable<int> RollDice(int diceCount, int faceCount)
		{
			var diceRolls = new int[diceCount];
			for (var i = 0; i < diceCount; i++)
			{
				diceRolls[i] = Convert.ToInt32(RollDie(faceCount));
			}

			return diceRolls;
		}

		private static ParseResult Parse(string input)
		{
			var regex = new Regex(ParsePattern);
			var match = regex.Match(input);
			return new ParseResult
			{
				DiceCount = Convert.ToInt32(match.Groups["diceCount"].Value),
				FaceCount = Convert.ToInt32(match.Groups["faceCount"].Value)
			};
		}
	}
}