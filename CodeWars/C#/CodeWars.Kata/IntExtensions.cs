namespace CodeWars.Kata
{
	public static class IntExtensions
	{
		public static int SumDigits(this int value)
		{
			var sum = 0;
			while (value > 0)
			{
				sum += value % 10;
				value /= 10;
			}

			return sum;
		}
	}
}