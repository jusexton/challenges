using System;
using System.Collections.Generic;
using System.Linq;

namespace FlattenList
{
    class Program
    {
        static void Main(string[] args)
        {
            var list = new List<object>
            {
                new List<object> { 1 },
                2,
                new List<object> { new List<object> { 3, 4 }, 5 },
                new List<object> { new List<object> { new List<object> { } } },
                new List<object> { new List<object> { new List<object> { 6 } } },
                7,
                8,
                new List<object> { }
            };

            var flatList = string.Join(", ", Flatten(list));
            Console.WriteLine(flatList);
        }

        private static List<T> Flatten<T>(IEnumerable<T> enumerable)
        {
            var result = new List<T>();
            foreach (var obj in enumerable)
            {
                if (obj is IEnumerable<T>)
                {
                    result.AddRange(Flatten((IEnumerable<T>) obj));
                }
                else
                {
                    result.Add(obj);
                }
            }

            return result;
        }
    }
}