using System.Linq;
using System.Text;

namespace CodeWars.Kata
{
	public static class RangeExtraction
	{
		public static string Extract(int[] args, string delimiter = ",")
		{
			var sb = new StringBuilder();
			var previous = args[0];
			var start = previous;
			foreach (var next in args.Skip(1))
			{
				if (previous + 1 != next)
				{
					sb.AppendRange(delimiter, start, previous).Append(delimiter);
					start = next;
				}

				previous = next;
			}

			return sb.AppendRange(delimiter, start, previous).ToString();
		}
	}
}