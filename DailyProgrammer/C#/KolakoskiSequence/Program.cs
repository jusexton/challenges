using System;
using System.Linq;

namespace KolakoskiSequence
{
    public static class Program
    {
        private static void Main(string[] args)
        {
            // Takes roughly 10 seconds on basic laptop.
            var sequenceGroup = KolakoskiSequenceGenerator.GetSequence()
                .Take(100000000)
                .GroupBy(x => x)
                .ToDictionary(x => x.Key, x => x.Count());
            Console.WriteLine($"{sequenceGroup[1]}:{sequenceGroup[2]}");
        }
    }
}
