using System;
using System.Collections.Generic;
using System.Linq;

namespace KolakoskiSequence
{
    public static class KolakoskiSequenceGenerator
    {
        public static IEnumerable<int> GetSequence()
        {
            int iteration = 0;
            var previous = new List<int>();
            while (true)
            {
                var element = previous.ElementAtOrDefault(iteration, iteration + 1);
                var digit = iteration % 2 == 0 ? 1 : 2;
                for (var i = 0; i < element; i++)
                {
                    previous.Add(digit);
                    yield return digit;
                }
                iteration++;
            }
        }
    }
}