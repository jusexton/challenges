using System.Linq;

namespace CodeWars.Kata
{
	public static class EqualArraySplit
	{
		public static int FindEqualSplitIndex(int[] numbers)
		{
			if (numbers.Sum() == 0) return 0;

			var leftSum = 0;
			for (var i = 0; i < numbers.Length; i++)
			{
				leftSum += numbers[i];
				// Plus 2 because we're not suppose to count the index the split is at.
				var rightSum = numbers.Skip(i + 2).Sum();

				if (leftSum == rightSum)
				{
					return i + 1;
				}
			}

			return -1;
		}
	}
}