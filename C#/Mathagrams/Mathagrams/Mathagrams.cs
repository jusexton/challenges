using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Mathagrams
{
    public class Mathagram
    {
        public static bool DuplicatesExist(string source)
        {
            var set = new HashSet<char>();
            return source.Any(x => !set.Add(x));
        }

        private static string Factoradic(char[] set, long l, double length)
        {
            StringBuilder sb = new StringBuilder();
            int size = set.Count();

            for (int i = 0; i <= length; i++)
            {
                sb = sb.Append(set[l % size]);
                l /= size;
            }

            return sb.ToString();
        }

        public static IEnumerable<string> GenerateCombination(char[] set, int minimum, int maximum)
        {
            for (int i = minimum; i <= maximum; i++)
            {
                double total = Math.Pow(set.Count(), i);
                for (long j = 0; j < total; j++)
                {
                    string combo = Factoradic(set, j, i - 1);
                    if (DuplicatesExist(combo))
                    {
                        continue;
                    }
                    yield return combo;
                }
            }
        }

        private static void Swap(ref char a, ref char b)
        {
            if (a == b) return;

            a ^= b;
            b ^= a;
            a ^= b;
        }

        public static void GetPer(char[] list)
        {
            int x = list.Length - 1;
            GetPer(list, 0, x);
        }

        private static void GetPer(char[] list, int k, int m)
        {
            if (k == m)
            {
                Console.WriteLine(list);
            }
            else
            {
                for (int i = k; i <= m; i++)
                {
                    Swap(ref list[k], ref list[i]);
                    GetPer(list, k + 1, m);
                    Swap(ref list[k], ref list[i]);
                }
            }   
        }

        public static List<char> GetAvailableNumbers(string mathagram)
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
            mathagram = Regex.Replace(mathagram, @"\s+", "");
            DataTable dt = new DataTable();
            char[] availableNumbers = GetAvailableNumbers(mathagram).ToArray();
            int size = availableNumbers.Count();

            foreach (string combo in GenerateCombination(availableNumbers, size, size))
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
