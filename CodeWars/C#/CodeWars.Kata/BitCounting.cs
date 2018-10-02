using System;
using System.Linq;

namespace CodeWars.Kata
{
	public class BitCounting
	{
		public static int CountBits(int n) => Convert.ToString(n, 2).Count(c => c.Equals('1'));
	}
}