namespace CodeWars.Kata
{
	public static class PersistentBugger
	{
		public static int Persistence(long value)
		{
			return Persistence(value, 0);
		}

		private static int Persistence(long value, int count)
		{
			return value < 10 ? count : Persistence(value.GetDigits().Product(), count + 1);
		}
	}
}