using System.Collections.Generic;

namespace Anagrams
{
    public class Permutations
    {
        public static IEnumerable<List<T>> Generate<T>(List<T> items)
        {
            if (items.Count == 0) yield return new List<T>();

            var copy = new List<T>(items);
            foreach (var i in items)
            {
                copy.Remove(i);
                foreach (var rest in Generate(copy))
                {
                    rest.Insert(0, i);
                    yield return rest;
                }
                copy.Insert(0, i);
            }
        }
    }
}