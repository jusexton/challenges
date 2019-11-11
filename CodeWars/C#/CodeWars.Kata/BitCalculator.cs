using System;
using System.Linq;

namespace CodeWars.Kata
{
    public static class BitCalculator
    {
        public static int Calculate(string numberOne, string numberTwo) => ToBaseTen(numberOne) + ToBaseTen(numberTwo);

        private static int ToBaseTen(string number)
        {
            var length = number.Length;
            return Enumerable.Range(1, length)
                .Select(index => number[index - 1] == '0' ? 0 : Power(2, Math.Abs(index - length)))
                .Sum();
        }

        private static int Power(int a, int b)
        {
            var y = 1;

            while (true)
            {
                if ((b & 1) != 0)
                {
                    y = a * y;
                }

                b >>= 1;

                if (b == 0)
                {
                    return y;
                }

                a *= a;
            }
        }
    }
}