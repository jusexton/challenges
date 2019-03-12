using System.Collections.Generic;
using System.Linq;

namespace CodeWars.Kata
{
    public static class ListFiltering
    {
        public static IEnumerable<int> GetIntegersFromList(IEnumerable<object> values) => values.OfType<int>();
    }
}