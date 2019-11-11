using System.Collections.Generic;

namespace CodeWars.Kata
{
	public static class EnoughIsEnough
	{
		public static int[] DeleteNthOccurrence(IEnumerable<int> numbers, int n)
		{
			var frequencyMap = new Dictionary<int, int>();

			var filteredNumbers = new List<int>();
			foreach (var number in numbers)
			{
				if (frequencyMap.TryGetValue(number, out var freq) && freq < n)
				{
					filteredNumbers.Add(number);
					frequencyMap[number] = freq + 1;
				}
				else if (freq == 0)
				{
					filteredNumbers.Add(number);
					frequencyMap.Add(number, 1);
				}
			}

			return filteredNumbers.ToArray();
		}
	}
}