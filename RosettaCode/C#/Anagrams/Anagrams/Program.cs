using System;
using System.IO;
using System.Linq;

namespace Anagrams
{
    internal class Program
    {
        private const string WordListPath = "C:\\Users\\Justin s\\Desktop\\Anagrams\\Anagrams\\Data\\unixdict.txt";

        public static void Main(string[] args)
        {
            var sortedWords = File.ReadAllLines(WordListPath)
                .GroupBy(word => string.Concat(word.OrderBy(c => c)))
                .GroupBy(c => c.Count())
                .OrderByDescending(group => group.Key);

            foreach (var character in sortedWords.First())
            {
                Console.WriteLine(string.Join(" ", character));
            }
        }
    }
}