using System;
using System.Collections.Generic;
using System.Linq;

namespace HappyNumbers
{
    public static class HappyNumerics
    {
        public static bool IsHappy(long value)
        {
            if (value < 1)
            {
                throw new ArgumentNullException(nameof(value), "Must be positive integer");
            }

            var seenNumbers = new HashSet<long>();
            while (value != 1 && !seenNumbers.Contains(value))
            {
                seenNumbers.Add(value);
                var digits = GetDigits(value);
                value = digits.Select(x => (long)Math.Pow(x, 2)).Sum();
            }

            return value == 1;
        }

        public static IEnumerable<long> HappyNumbers()
        {
            var number = 1;
            while (true)
            {
                if (IsHappy(number))
                {
                    yield return number;
                }
                number++;
            }
        }

        // Helper function used to return stack of digits
        // that make up a given numberic value.
        private static Stack<int> GetDigits(long value)
        {
            var digits = new Stack<int>();
            while (value > 0)
            {
                digits.Push((int)value % 10);
                value /= 10;
            }
            return digits;
        }
    }
}