using System;
using System.Collections.Generic;
using System.Linq;

namespace Mode
{
    class Program
    {
        private static readonly int[] testNumbers = { 1, 5, 3, 7, 1, 4, 7, 5, 5 };
        static void Main(string[] args)
        {
            Console.WriteLine(Mode(testNumbers));
            Console.WriteLine(Mode(testNumbers.Take(7)));
        }

        private static int Mode(IEnumerable<int> values)
        {
            return values.GroupBy(i => i)
                .OrderByDescending(group => group.Count())
                .Select(group => group.Key)
                .First();
        }
    }
}
