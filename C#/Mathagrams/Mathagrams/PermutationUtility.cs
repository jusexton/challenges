using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mathagrams
{
    // Contains permutation utilities
    public class PermutationUtility
    {
        private static List<string> Permutations;

        private static void Swap(ref char a, ref char b)
        {
            if (a == b) return;

            a ^= b;
            b ^= a;
            a ^= b;
        }

        public static List<string> GetPermutations(char[] list)
        {
            int x = list.Length - 1;
            Permutations = new List<string>();
            GetPermutations(list, 0, x);
            return Permutations;
        }

        // TODO: Modify function to become Enumerable.
        // Bug: Crashes application because of too much memory usage.
        private static void GetPermutations(char[] list, int k, int m)
        {
            if (k == m)
            {
                Permutations.Add(new string(list));
            }
            else
            {
                for (int i = k; i <= m; i++)
                {
                    Swap(ref list[k], ref list[i]);
                    GetPermutations(list, k + 1, m);
                    Swap(ref list[k], ref list[i]);
                }
            } 
        }
    }
}
