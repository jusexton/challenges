using System;

namespace Sorting
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            var testValues = new string[]
            {
                "a", "y", "b", "c", "z", "r"
            };

            Console.WriteLine(string.Join(", ", Sorting.MergeSort(testValues)));
        }
    }
}
