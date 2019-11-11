using System;

namespace CodeWars.Kata
{
	public static class TakeWalk
	{
		public static bool IsValidWalk(string[] walk)
		{
			// Walk shouldn't be valid if their are more or less than 10 movements.
			if (walk == null || walk.Length != 10)
			{
				return false;
			}

			var differenceInX = 0;
			var differenceInY = 0;

			foreach (var w in walk)
			{
				switch (w)
				{
					case "n":
						differenceInY += 1;
						break;
					case "s":
						differenceInY -= 1;
						break;
					case "e":
						differenceInX += 1;
						break;
					case "w":
						differenceInX -= 1;
						break;
					default:
						throw new ArgumentOutOfRangeException(nameof(walk), $"{w} is not a valid direction.");
				}
			}

			return differenceInX == 0 && differenceInY == 0;
		}
	}
}