using System.Collections.Generic;

namespace CodeWars.Kata
{
	public class EnoughIsEnough
	{
		public static int[] DeleteNthOccurrence(IEnumerable<int> numbers, int n)
		{
			var freqMap = new Dictionary<int, int>();

			var filteredNumbers = new List<int>();
			foreach (var number in numbers)
			{
				if (freqMap.TryGetValue(number, out var freq) && freq < n)
				{
					filteredNumbers.Add(number);
					freqMap[number] = freq + 1;
				}
				else if (freq == 0)
				{
					filteredNumbers.Add(number);
					freqMap.Add(number, 1);
				}
			}

			return filteredNumbers.ToArray();
		}
	}
}