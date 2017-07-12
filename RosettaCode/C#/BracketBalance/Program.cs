using System;

namespace BracketBalance
{
    class Program
    {
        private static readonly string[] testText =
        {
         "",
         "[]",
         "[][]",
         "[[][]]",
         "][",
         "][][",
         "[]][[]"
        };

        static void Main(string[] args)
        {
            foreach (var text in testText)
            {
                Console.WriteLine($"{text} Valid: {BracketsBalanced(text)}");
            }
        }

        private static bool BracketsBalanced(string text, char open = '[', char closed = ']')
        {
            var level = 0;
            foreach (var character in text)
            {
                if (character == closed)
                {
                    if (level == 0)
                    {
                        return false;
                    }
                    level--;
                }
                else if (character == open)
                {
                    level++;
                }
            }
            return level == 0;
        }
    }
}
