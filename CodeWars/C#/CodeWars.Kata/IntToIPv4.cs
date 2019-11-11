using System;
using System.Linq;

namespace CodeWars.Kata
{
	public static class IntToIPv4
	{
		public static string UInt32ToIP(uint integer, int groupCount = 8)
		{
			var binary = Convert.ToString(integer, 2).PadLeft(32, '0');
			var octets = Enumerable.Range(0, binary.Length / groupCount)
				.Select(i => binary.Substring(i * groupCount, groupCount))
				.Select(b => Convert.ToInt32(b, 2));
			return string.Join(".", octets);
		}
	}
}