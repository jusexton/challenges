using System.Collections.Generic;

namespace DragonCurveSequence
{
	public static class DragonCurve
	{
		public static IEnumerable<string> GetSequence()
		{
			var result = "1";
			while (true)
			{
				yield return result;
				result = $"{result}{result}0";
			}
		}
	}
}