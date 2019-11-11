using System;
using System.Collections.Generic;
using System.Linq;

namespace CodeWars.Kata
{
    public static class WeightToWeight
    {
//      Refactored version
//		public static string OrderWeight(string s)
//			=> string.Join(" ", s.Split(' ')
//				.OrderBy(n => n.ToCharArray()
//					.Select(c => (int) char.GetNumericValue(c)).Sum())
//				.ThenBy(n => n));

        public static string OrderWeight(string weight)
            => string.Join(" ", weight.Split(" ").OrderBy(n => n, new WeightComparer()));

        private class WeightComparer : IComparer<string>
        {
            public int Compare(string x, string y)
            {
                var xSum = SumStringDigits(x);
                var ySum = SumStringDigits(y);

                return xSum == ySum ? string.Compare(x, y, StringComparison.Ordinal) : xSum - ySum;
            }

            private static int SumStringDigits(string str)
                => Convert.ToInt64(str).SumDigits();
        }
    }
}