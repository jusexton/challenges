using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/// <summary>
/// Inspired by r/dailyprogrammer
/// https://www.reddit.com/r/dailyprogrammer/comments/576o8o/20161012_challenge_287_intermediate_mathagrams/
/// Difficulty: Intermediate
/// </summary>
namespace Mathagrams
{
    public class Program
    {
        private static readonly string[] expressions =
            {
                "1xx+xxx=468",
                "xxx+x81=9x4",
                "xxx+5x1=86x",
                "xxx+39x=x75",
                "xxx+xxx+5x3+123=xxx+795",
                "xxx+xxx+23x+571=xxx+x82",
                "xxx+xxx+xx7+212=xxx+889",
                "xxx+xxx+1x6+142=xxx+553"
                // "xxx+xxx+xxx+x29+821=xxx+xxx+8xx+867" Causes OutOfMemoryException
            };

        public static void Main(string[] args)
        {
            foreach (string expression in expressions)
            {
                Console.WriteLine(Mathagram.Solve(expression));
            }
        }
    }
}
