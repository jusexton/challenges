using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/// <summary>
/// Inspired by r/dailyprogrammer
/// https://www.reddit.com/r/dailyprogrammer/comments/576o8o/20161012_challenge_287_intermediate_mathagrams/
/// </summary>
namespace Mathagrams
{
    public class Program
    {
        public static void Main(string[] args)
        {
            string result = MathagramSolver.Solve("1xx+xxx=468");
            Console.WriteLine(result);
        }
    }
}
