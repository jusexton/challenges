using System;
using System.Collections.Generic;
using System.Linq;

namespace HappyNumbers
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            int limit;
            if (!int.TryParse(args[0], out limit))
            {
                Console.WriteLine("Arguement must be an integer.");
                return;
            }

            if (limit < 1)
            {
                Console.WriteLine("Arguement must be a positive integer.");
                return;
            }

            var number = 1;
            var happyNumbers = new HashSet<long>();
            while (happyNumbers.Count < limit)
            {
                if (IsHappy(number))
                {
                    happyNumbers.Add(number);
                }
                number++;
            }

            Console.WriteLine($"First {limit} HappyNumbers: {string.Join(", ", happyNumbers)}");
        }

        private static bool IsHappy(long value)
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
