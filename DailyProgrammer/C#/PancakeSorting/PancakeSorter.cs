using System.Collections.Generic;
using System.Linq;

namespace PancakeSorting
{
    public static class PancakeSorter
    {
        public static PancakeSortResult Sort(List<int> pancakes)
        {
            var result = new PancakeSortResult(pancakes);

            for (var i = pancakes.Count; i > 0; i--)
            {
                var max = pancakes.Take(i).Max();
                if (max == pancakes[i - 1])
                {
                    continue;
                }

                var indexRangeMax = pancakes.IndexOf(max);
                if (indexRangeMax != 0)
                {
                    pancakes.Swap(0, indexRangeMax);
                    result.LogSwap(string.Join(",", pancakes));
                }

                pancakes.Swap(0, i - 1);
                result.LogSwap(string.Join(",", pancakes));
            }

            return result;
        }
    }
}