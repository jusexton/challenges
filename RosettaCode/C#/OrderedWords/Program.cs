using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace OrderedWords
{
    class Program
    {
        static void Main(string[] args)
        {
            var orderedWords = File.ReadAllLines("words.txt").Where(IsOrdered);
            var largestWordLength = orderedWords.Max(word => word.Length);
            var result = string.Join(", ", orderedWords.Where(word => word.Length == largestWordLength));
            Console.WriteLine(result);
        }

        private static bool IsOrdered(string word)
        {
            return String.Concat(word.OrderBy(c => c)) == word;
        }
    }
}
