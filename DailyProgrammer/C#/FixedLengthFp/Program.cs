using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace FixedLengthFp
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            var result = CollectEntries("data.txt")
                .OrderBy(x => x.Salary)
                .Last();
            Console.WriteLine($"{result.Name}, {result.Salary.ToString("C")}");
        }

        private static List<Entry> CollectEntries(string path)
        {
            var entries = new List<Entry>();
            foreach (var line in File.ReadAllLines(path))
            {
                if (line.StartsWith("::EXT::"))
                {
                    if (line.Contains("SAL"))
                    {
                        var value = new string(line.TakeLast(17).ToArray()).TrimStart('0');
                        entries.Last().Salary = Convert.ToDecimal(value);
                    }
                    continue;
                }
                var name = new string(line.Take(20).ToArray()).TrimEnd();
                entries.Add(new Entry { Name = name });
            }
            return entries;
        }

        public class Entry
        {
            public string Name { get; set; }
            public decimal Salary { get; set; } = 0;
        }
    }
}
