using System;
using System.Collections.Generic;
using System.Linq;

namespace Anagrams
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var anagrams = GenerateAnagrams("Justin").ToList();
            anagrams.ForEach(anagram => Console.WriteLine(anagram));
            Console.WriteLine("Number of Anagrams: {0}", anagrams.Count());
        }

        private static IEnumerable<string> GenerateAnagrams(string word)
        {
            return Permutations.Generate(word.ToCharArray().ToList())
                .Select(x => new String(x.ToArray()));
        }
    }
}