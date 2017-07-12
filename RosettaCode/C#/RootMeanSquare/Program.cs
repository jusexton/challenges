using System;
using System.Collections.Generic;
using System.Linq;

namespace RootMeanSquare
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(RootMeanSquare(Enumerable.Range(1, 10)));
        }

        private static double RootMeanSquare(IEnumerable<int> values)
        {
            var count = values.Count();
            if (count == 0)
            {
                throw new InvalidOperationException("Empty Collection");
            }

            double squaredSum = values.Sum(value => value * value);
            return Math.Sqrt(squaredSum / count);
        }
    }
}
