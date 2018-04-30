using System;
using System.Linq;

namespace DragonCurveSequence
{
	public static class Program
	{
		private static void Main() =>
			DragonCurve.GetSequence()
				.Take(8)
				.ToList()
				.ForEach(Console.WriteLine);
	}
}