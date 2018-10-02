using System;
using System.Linq;

namespace CodeWars.Kata
{
	public class AreTheySame
	{
		public static bool Compute(int[] a, int[] b)
		{
			if (a == null || b == null)
			{
				return false;
			}

			if (a.Length != b.Length)
			{
				return false;
			}

			return b.Select(number => (int) Math.Sqrt(number))
				.OrderBy(n => n)
				.SequenceEqual(a.OrderBy(n => n));
		}
	}
}