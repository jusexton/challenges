using System;
using System.IO;
using System.Linq;

namespace CharacterFrequency
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            var characterFrequencyMap = File.ReadAllText("data.txt")
                .GroupBy(c => c)
                .OrderBy(c => c.Key)
                .ToDictionary(group => group.Key, group => group.Count());

            foreach (var entry in characterFrequencyMap)
            {
                Console.WriteLine($"{entry.Key} - {entry.Value}");
            }
        }
    }
}
