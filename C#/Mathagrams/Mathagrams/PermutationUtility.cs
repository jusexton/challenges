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
        private static void Swap(ref char a, ref char b)
        {
            if (a == b) return;

            a ^= b;
            b ^= a;
            a ^= b;
        }

        public static IEnumerable<string> GetPermutations(char[] list)
        {
            int x = list.Length - 1;
            foreach (string perm in GetPermutations(list, 0, x))
            {
                yield return perm;
            }
        }

        private static IEnumerable<string> GetPermutations(char[] list, int k, int m)
        {
            if (k == m)
            {
                yield return new string(list);
            }
            else
            {
                for (int i = k; i <= m; i++)
                {
                    Swap(ref list[k], ref list[i]);
                    foreach (string perm in GetPermutations(list, k + 1, m))
                    {
                        yield return perm;
                    }
                    Swap(ref list[k], ref list[i]);
                }
            } 
        }
    }
}
