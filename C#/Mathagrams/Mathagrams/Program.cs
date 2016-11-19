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
                "xxx+xxx+1x6+142=xxx+553",
                "xxx+xxx+xxx+x29+821=xxx+xxx+8xx+867",
                "xxx+xxx+xxx+4x1+689=xxx+xxx+x5x+957",
                "xxx+xxx+xxx+64x+581=xxx+xxx+xx2+623",
                "xxx+xxx+xxx+x81+759=xxx+xxx+8xx+462",
                "xxx+xxx+xxx+6x3+299=xxx+xxx+x8x+423",
                "xxx+xxx+xxx+58x+561=xxx+xxx+xx7+993"
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
