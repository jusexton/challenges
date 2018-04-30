using System;
using System.Collections.Generic;

namespace PancakeSorting
{
	public static class Program
	{
		private static void Main()
		{
			var pancakes = new List<int> {1, 8, 6, 4, 5, 7, 2, 3, 9, 10};
			var result = PancakeSorter.Sort(pancakes);
			Console.WriteLine(result.BuildSortSummary());
		}
	}
}