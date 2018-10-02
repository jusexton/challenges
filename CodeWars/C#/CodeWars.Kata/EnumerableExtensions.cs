using System.Collections.Generic;
using System.Linq;

namespace CodeWars.Kata
{
	public static class EnumerableExtensions
	{
		public static IEnumerable<T> Difference<T>(this IEnumerable<T> elements, IEnumerable<T> otherElements)
		{
			var elementsArray = elements as T[] ?? elements.ToArray();
			var otherElementsArray = otherElements as T[] ?? otherElements.ToArray();

			var uniqueElements = elementsArray.Except(otherElementsArray);
			var uniqueOtherElements = otherElementsArray.Except(elementsArray);
			return uniqueElements.Concat(uniqueOtherElements);
		}

		public static int Product(this IEnumerable<int> numbers)
		{
			var enumerable = numbers as int[] ?? numbers.ToArray();
			return enumerable.Length != 0 ? enumerable.Aggregate((a, b) => a * b) : 0;
		}

		public static IEnumerable<string> AnagramsOf(this IEnumerable<string> elements, string value)
			=> elements.Where(s => s.IsAnagramOf(value));
	}
}