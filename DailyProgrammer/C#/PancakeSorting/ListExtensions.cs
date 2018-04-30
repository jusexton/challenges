using System.Collections.Generic;

namespace PancakeSorting
{
	public static class ListExtensions
	{
		public static void Swap<T>(this IList<T> list, int indexA, int indexB)
		{
			var tmp = list[indexA];
			list[indexA] = list[indexB];
			list[indexB] = tmp;
		}
	}
}