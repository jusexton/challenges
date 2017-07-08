using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace BabbageProblem
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            // First displayed number is the lowest.
            foreach (var number in EndingIn())
            {
                var sqrt = Math.Sqrt(number);
                if (!(Math.Abs(sqrt % 1) < double.Epsilon * 100)) continue;
                Console.WriteLine("The smallest integer whose square ends in 269,696 is: {0}", sqrt);
                Console.WriteLine("It's square is: {0}", number);
            }

            //Parallel.ForEach(EndingIn(), number =>
            //{
            //    var sqrt = Math.Sqrt(number);
            //    if (!(Math.Abs(sqrt % 1) < double.Epsilon * 100)) return;
            //    Console.WriteLine("The smallest integer whose square ends in 269,696 is: {0}", sqrt);
            //    Console.WriteLine("It's square is: {0}", number);
            //});
        }

        private static IEnumerable<long> EndingIn()
        {
            const string ending = "269696";

            long counter = 0;
            while (true)
            {
                counter++;
                yield return Convert.ToInt64(string.Format("{0}{1}", counter, ending));
            }
        }
    }
}