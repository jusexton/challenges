using System;
using System.Collections.Generic;
using System.Linq;

namespace DucciSequence
{
	public static class Program
	{
		private static readonly List<long[]> Sequnces = new List<long[]>
		{
			new long[] {0, 653, 1854, 4063},
			new long[] {1, 5, 7, 9, 9},
			new long[] {1, 2, 1, 2, 1, 0},
			new long[] {10, 12, 41, 62, 31, 50},
			new long[] {10, 12, 41, 62, 31}
		};

		private static void Main()
		{
			Sequnces.Select(DucciSequence.Perform)
				.ToList()
				.ForEach(DisplayDucciResult);
		}

		private static void DisplayDucciResult(DucciResult result)
		{
			foreach (var sequence in result.Sequences)
			{
				Console.WriteLine(string.Join(", ", sequence));
			}

			Console.WriteLine($"Steps: {result.Steps}");
		}
	}
}