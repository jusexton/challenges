namespace CodeWars.Kata
{
	public static class TrailingZeros
	{
		public static int CountTrailingZerosInFactorial(int value)
		{
			var count = 0;
			for (var i = 5; value / i >= 1; i *= 5)
			{
				count += value / i;
			}

			return count;
		}
	}
}