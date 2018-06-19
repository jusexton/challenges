using System;

namespace DiceRoller
{
	public static class RandomExtensions
	{
		public static long NextLong(this Random random, long min, long max)
		{
			var buffer = new byte[8];
			random.NextBytes(buffer);
			var longRand = BitConverter.ToInt64(buffer, 0);
			return Math.Abs(longRand % (max - min)) + min;
		}
	}
}