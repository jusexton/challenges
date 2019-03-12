using System;
using System.Collections.Generic;
using System.Linq;

namespace CodeWars.Kata
{
    public static class FindDivisors
    {
        // public static IEnumerable<int> Find(int value) =>
        //     Enumerable.Range(2, (int)Math.Sqrt(value)).Where(n => value % n == 0);

        public static IEnumerable<int> Find(int value)
        {
            var divisors = new List<int>();
            var max = (int)Math.Sqrt(value);
            for (var divisor = 2; divisor <= max; divisor++)
            {
                if (value % divisor == 0)
                {
                    divisors.Add(divisor);
                    if (divisor != value / divisor)
                    {
                        // Don't add the square root twice
                        divisors.Add(value / divisor);
                    }
                }
            }

            return divisors.OrderBy(n => n);
        }
    }
}