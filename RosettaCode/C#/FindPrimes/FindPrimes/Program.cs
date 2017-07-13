using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace FindPrimes
{
    class Program
    {
        static void Main(string[] args)
        {
            Parallel.ForEach(GetPrimes().Take(100), Console.WriteLine);
        }

        private static IEnumerable<int> GetPrimes()
        {
            // Counter starts at 2 since 1 cant be prime.
            var counter = 2;
            while (true)
            {
                if (IsPrime(counter)) yield return counter;
                counter++;
            }
        }

        private static bool IsPrime(int value)
        {
            // Counter starts at 2 because dividing by 1 is redundant when checking for prime.
            for (var i = 2; i <= Math.Sqrt(value); i++)
            {
                if (value % i == 0) return false;
            }
            return true;
        }
    }
}