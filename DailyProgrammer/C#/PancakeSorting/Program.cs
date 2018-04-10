using System;
using System.Collections.Generic;

namespace PancakeSorting
{
    public static class Program
    {
        private static void Main(string[] args)
        {
            var pancakes = new List<int>() { 10, 8, 4, 3, 6, 4, 9, 8 };
            var result = PancakeSorter.Sort(pancakes);
            Console.WriteLine(result.BuildSortSummary());
        }
    }
}
