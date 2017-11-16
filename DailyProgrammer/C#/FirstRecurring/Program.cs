using System;
using System.Collections.Generic;
using System.Linq;

namespace FirstRecurring
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            var testInput = new[]
            {
                "ABCDEBC",
                "IKEUNFUVFV",
                "PXLJOUDJVZGQHLBHGXIW",
                "*l1J?)yn%R[}9~1\"=k7]9;0[$"
            };

            foreach (var test in testInput)
            {
                Console.WriteLine($"Input: {test}, Result: {FirstRecurringCharacter(test)}");
            }
        }

        private static char? FirstRecurringCharacter(string input)
        {
            var characters = input.ToCharArray();
            var visitedCharacters = new List<char>();

            foreach (var character in characters)
            {
                if (visitedCharacters.Contains(character))
                {
                    return character;
                }
                visitedCharacters.Add(character);
            }
            return null;
        }
    }
}
