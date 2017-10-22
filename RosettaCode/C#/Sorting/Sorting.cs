using System;
using System.Collections.Generic;
using System.Linq;

namespace Sorting
{
    public class Sorting
    {
        public static IEnumerable<T> MergeSort<T>(
            IEnumerable<T> values, bool reversed = false) where T : IComparable
        {
            if (values.Count() <= 1) return values;

            // Divide array in half and merge sort recursively
            var half = values.Count() / 2;
            var left = Sorting.MergeSort(values.Take(half).ToList(), reversed);
            var right = Sorting.MergeSort(values.Skip(half).ToList(), reversed);

            return Merge(left, right, reversed);
        }

        private static List<T> Merge<T>(
            IEnumerable<T> left, IEnumerable<T> right, bool reversed)
            where T : IComparable
        {
            var reverse = reversed ? 1 : -1;

            var leftIndex = 0;
            var rightIndex = 0;
            var result = new List<T>();
            while (leftIndex < left.Count() && rightIndex < right.Count())
            {
                if (left.ElementAt(leftIndex).CompareTo(right.ElementAt(rightIndex)) == reverse)
                {
                    result.Add(left.ElementAt(leftIndex));
                    leftIndex++;
                }
                else
                {
                    result.Add(right.ElementAt(rightIndex));
                    rightIndex++;
                }
            }

            result.AddRange(left.Skip(leftIndex));
            result.AddRange(right.Skip(rightIndex));
            return result;
        }
    }
}