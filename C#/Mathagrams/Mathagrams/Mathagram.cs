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
            int xCount = mathagram.Count(s => s == 'x');
            Regex regex = new Regex("[^1-9]");
            char[] usedNumbers = regex.Replace(mathagram, "").ToCharArray();

            List<char> availableNumbers = new List<char>();
            int multiplier = (usedNumbers.Count() + xCount) / 9;

            for (int i = 0; i < multiplier; i++)
            {
                for (int j = 1; j <= 9; j++)
                {
                    char number = (char)(j + 48);
                    if (usedNumbers.Contains(number))
                    {
                        int index = Array.IndexOf(usedNumbers, number);
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
            DataTable dt = new DataTable();
            char[] availableNumbers = FindAvailableNumbers(mathagram).ToArray();

            foreach (string combo in PermutationUtility.GetPermutations(availableNumbers))
            {
                string newMathagram = mathagram;
                foreach (char c in combo)
                {
                    Regex regex = new Regex(Regex.Escape("x"));
                    newMathagram = regex.Replace(newMathagram, c.ToString(), 1);
                }

                string[] expressions = newMathagram.Split('=');
                int left = Convert.ToInt32(dt.Compute(expressions[0], ""));
                int right = Convert.ToInt32(dt.Compute(expressions[1], ""));
                if (left == right)
                {
                    return newMathagram;
                }
            }
            return null;
        }
    }
}
