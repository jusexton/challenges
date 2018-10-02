using System.Linq;

namespace CodeWars.Kata
{
	public class CountingDuplicates
	{
		public static int DuplicateCount(string str)
			=> str.ToLower().GroupBy(c => c)
				.ToDictionary(g => g.Key, g => g.Count())
				.Count(e => e.Value > 1);
	}
}