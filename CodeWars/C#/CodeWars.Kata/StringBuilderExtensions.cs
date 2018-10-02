using System.Text;

namespace CodeWars.Kata
{
	public static class StringBuilderExtensions
	{
		public static StringBuilder AppendRange(this StringBuilder sb, string delimiter, int start, int end)
		{
			sb.Append(start);
			if (start != end)
			{
				var between = end - start > 1 ? "-" : delimiter;
				sb.Append(between).Append(end);
			}

			return sb;
		}
	}
}