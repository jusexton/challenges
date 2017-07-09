using System;
using System.Collections.Generic;

namespace HailstoneSequence
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            var sequence = HailstoneSequence.GetSequence(27);
            Console.WriteLine(string.Join(", ", sequence) + "\n");

            var largestSequenceData = HailstoneSequence.GetLargestSequenceInRange(1, 100000);
            Console.WriteLine("Value: {0}, Size: {1}",
                largestSequenceData.value,
                largestSequenceData.sequence.Count);
        }

        public class HailstoneSequence
        {
            public static List<int> GetSequence(int value)
            {
                if (value <= 0) throw new ArgumentOutOfRangeException(nameof(value));

                var sequence = new List<int> {value};
                while (value != 1)
                {
                    if (value % 2 == 0)
                    {
                        value /= 2;
                    }
                    else
                    {
                        value = 3 * value + 1;
                    }
                    sequence.Add(value);
                }
                return sequence;
            }

            public static (int value, List<int> sequence) GetLargestSequenceInRange(int min, int max)
            {
                var value = min;
                var largestSequence = GetSequence(min);
                for (var i = min + 1; i <= max; i++)
                {
                    var possibleLargest = GetSequence(i);
                    if (possibleLargest.Count <= largestSequence.Count) continue;
                    largestSequence = possibleLargest;
                    value = i;
                }
                return (value, largestSequence);
            }
        }
    }
}