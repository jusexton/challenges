using System;
using System.Collections.Generic;
using System.Linq;

namespace PopulationCount
{
    class Program
    {
        private static void Main(string[] args)
        {
            var populations = Enumerable.Range(0, 30)
                .Select(number => GetPopulationCount((long)Math.Pow(3, number)));

            Console.WriteLine($"3^n: {string.Join(", ", populations)}");

            var evilPopulations = new List<int>(30);
            var odiusPopulations = new List<int>(30);
            var evilCount = 0;
            var odiusCount = 0;
            var index = 0;
            while (true)
            {
                var population = GetPopulationCount(index);
                if (population % 2 == 0 && evilPopulations.Count < 30)
                {
                    evilPopulations.Add(index);
                    evilCount++;
                }
                else if (odiusPopulations.Count < 30)
                {
                    odiusPopulations.Add(index);
                    odiusCount++;
                }
                else
                {
                    break;
                }
                index++;
            }

            Console.WriteLine($"Evil: {string.Join(", ", evilPopulations)}");
            Console.WriteLine($"Odius: {string.Join(", ", odiusPopulations)}");
        }

        private static int GetPopulationCount(long value)
        {
            if (value < 0)
            {
                throw new ArgumentOutOfRangeException("Value must be positive");
            }

            var bits = Convert.ToString(value, 2);
            return bits.ToCharArray().Where(c => c == '1').Count();
        }
    }
}
