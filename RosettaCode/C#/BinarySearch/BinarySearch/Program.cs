using System;
using System.Collections.Generic;
using System.Linq;

namespace BinarySearch
{
    class Program
    {
        private static readonly int[] testNumbers = { 1, 2, 3, 4, 6, 7, 8, 10 }; 

        static void Main(string[] args)
        {
            const int key = 8;
            Console.WriteLine(Array.BinarySearch(testNumbers, key));
            Console.WriteLine(BinarySearch(testNumbers, key));
        }

        private static int BinarySearch(IReadOnlyCollection<int> array, int key)
        {
            var low = 0;
            var high = array.Count;

            while (low <= high)
            {
                var mid = (high + low) / 2;

                if (array.ElementAt(mid) > key)
                {
                    high = mid - 1;
                }
                else if (array.ElementAt(mid) < key)
                {
                    low = mid + 1;
                }
                else
                {
                    return mid;
                }
            }

            return -1;
        }
    }
}