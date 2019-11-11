using System;
using System.Linq;

namespace CodeWars.Kata
{
    public static class AreTheySame
    {
        public static bool Compute(int[] a, int[] b)
        {
            var eitherValuesAreNull = a == null || b == null;
            if (eitherValuesAreNull)
            {
                return false;
            }

            var arrayLengthsAreEqual = a.Length == b.Length;
            if (!arrayLengthsAreEqual)
            {
                return false;
            }

            return b.Select(number => (int) Math.Sqrt(number))
                .OrderBy(n => n)
                .SequenceEqual(a.OrderBy(n => n));
        }
    }
}