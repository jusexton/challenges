using System;
using System.Linq;

namespace SimpleAdding
{
	public static class Program
	{
		private static void Main()
		{
			Console.WriteLine(SimpleAdding(4));
		}

		private static int SimpleAdding(int num) => Enumerable.Range(1, num).Sum();
	}
}