using System;
using System.Collections.Generic;
using System.Linq;

namespace ArithmeticMean
{
    class Program
    {
        private static readonly int[] testNumbers = { 90, 100, 95, 20, 40 };

        private static void Main(string[] args)
        {
            Console.WriteLine($"Mean Of {string.Join(", ", testNumbers)} Is {Mean(testNumbers)}");
        }

        private static double Mean(IEnumerable<int> values) => values.Average();
    }
}
