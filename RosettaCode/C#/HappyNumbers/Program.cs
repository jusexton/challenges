using System;
using System.Collections.Generic;
using System.Linq;

namespace HappyNumbers
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            var limit = int.Parse(args[0]);
            var happyNumbers = HappyNumerics.HappyNumbers()
                .Take((limit));

            Console.WriteLine($"First {limit} HappyNumbers: {string.Join(", ", happyNumbers)}");
        }


    }
}
