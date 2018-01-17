using System;
using System.Collections.Generic;
using System.Linq;

namespace PerfectShuffle
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            var shuffledList = Enumerable.Range(1, 1020).ToList();
            Console.WriteLine(string.Join(", ", shuffledList));
            for (var index = 0; index < 1018; index++)
            {
                shuffledList = ListShuffler.PerfectShuffle(shuffledList);
                Console.WriteLine(string.Join(", ", shuffledList));
            }
        }
    }
}
