using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Mathagrams
{
    // Contains functions related to mathagrams
    public class Mathagram
    {
        public static List<char> FindAvailableNumbers(string mathagram)
        {
            var xCount = mathagram.Count(s => s == 'x');
            var regex = new Regex("[^1-9]");
            var usedNumbers = regex.Replace(mathagram, "").ToCharArray();

            var availableNumbers = new List<char>();
            var multiplier = (usedNumbers.Count() + xCount) / 9;
            for (var i = 0; i < multiplier; i++)
            {
                for (var j = 1; j <= 9; j++)
                {
                    var number = (char)(j + 48);
                    if (usedNumbers.Contains(number))
                    {
                        var index = Array.IndexOf(usedNumbers, number);
                        usedNumbers = usedNumbers.RemoveAt(index);
                    }
                    else
                    {
                        availableNumbers.Add(number);
                    }
                }
            }
            return availableNumbers;
        }

        public static string Solve(string mathagram)
        {
            var dt = new DataTable();
            var availableNumbers = FindAvailableNumbers(mathagram).ToArray();

            foreach (var combo in PermutationUtility.GetPermutations(availableNumbers))
            {
                var newMathagram = mathagram;
                foreach (var c in combo)
                {
                    var regex = new Regex(Regex.Escape("x"));
                    newMathagram = regex.Replace(newMathagram, c.ToString(), 1);
                }

                var expressions = newMathagram.Split('=');
                var left = Convert.ToInt32(dt.Compute(expressions[0], ""));
                var right = Convert.ToInt32(dt.Compute(expressions[1], ""));
                if (left == right)
                {
                    return newMathagram;
                }
            }
            return null;
        }
    }
}
