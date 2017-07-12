using System;
using System.Collections.Generic;
using System.Linq;

namespace Median
{
    class Program
    {
        private static readonly int[] testNumbers = { 1, 5, 3, 6, 4, 2 };
        static void Main(string[] args)
        {
            Console.WriteLine(Median(testNumbers));
            Console.WriteLine(Median(testNumbers.Take(5)));
        }

        private static double Median(IEnumerable<int> values)
        {
            var count = values.Count();
            if (count == 0)
            {
                throw new InvalidOperationException("Empty Collection");
            }

            var sortedValues = values.OrderBy(i => i);
            var mid = count / 2;
            if (count % 2 == 0)
            {
                return (double)(sortedValues.ElementAt(mid) + sortedValues.ElementAt(mid + 1)) / 2;
            }
            return sortedValues.ElementAt(mid);
        }
    }
}
