using System;
using System.Numerics;
using System.Linq;

namespace SumOfDigits
{
    internal class Program
    {
        private static (int, int)[] testData =
        {
            (2, 1234),
            (11, 4000),
            (50, 3000)
        };

        private static void Main(string[] args)
        {
            foreach (var tuple in testData)
            {
                var number = BigInteger.Pow(tuple.Item1, tuple.Item2);
                Console.WriteLine(SumDigits(number.ToString()));
            }
        }

        private static int SumDigits(string value)
        {
            var sum = 0;
            foreach (var digit in value)
            {
                sum += digit - '0';
            }
            return sum;
        }
    }
}
