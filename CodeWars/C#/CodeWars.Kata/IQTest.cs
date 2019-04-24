using System;
using System.Collections.Generic;
using System.Linq;

namespace CodeWars.Kata
{
    public static class IQTest
    {
        private static readonly Dictionary<int, int> DeciderMap = new Dictionary<int, int>()
        {
            {0, 0},
            {1, 0},
            {2, 1},
            {3, 1}
        };

        public static int Test(string numberString)
        {
            var numbers = numberString.Split(" ").Select(n => Convert.ToInt32(n)).ToArray();

            var evenSum = numbers
                        .Select(number => number.IsEven())
                        .Select(bit => bit ? 1 : 0)
                        .Take(3)
                        .Sum();

            var decider = DeciderMap[evenSum];
            return Enumerable.Range(0, numbers.Length).First(index => numbers[index] % 2 == decider) + 1;
        }

        public static Boolean IsEven(this int number) => number % 2 == 0;
    }
}