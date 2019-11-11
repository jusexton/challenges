namespace CodeWars.Kata
{
	public static class BuildTower
	{
		public static string[] Build(int nFloors)
		{
			var tower = new string[nFloors];
			for (var i = 0; i < nFloors; i++)
			{
				var empty = new string(' ', nFloors - i - 1);
				var asterisks = new string('*', i * 2 + 1);
				tower[i] = $"{empty}{asterisks}{empty}";
			}

			return tower;
		}
	}
}