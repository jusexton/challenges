using System;
using System.Collections.Generic;
using System.Linq;

namespace PerfectShuffle
{
    public static class ListShuffler
    {
        private static Random _random = new Random();

        public static List<T> Shuffle<T>(List<T> items)
        {
            var itemCount = items.Count;
            var listCopy = new List<T>(items);

            for (var index = 0; index < itemCount; index++)
            {
                var randomInt = index + _random.Next(itemCount - index);
                var randomItem = listCopy[randomInt];
                listCopy[randomInt] = listCopy[index];
                listCopy[index] = randomItem;
            }

            return listCopy;
        }

        public static List<T> PerfectShuffle<T>(List<T> items)
        {
            if (items.Count % 2 != 0)
            {
                throw new ArgumentOutOfRangeException(
                    "List must have even number of elements.");
            }

            var middle = items.Count / 2;
            var perfectShuffle = new List<T>();
            var flip = true;
            var index = 0;
            while (perfectShuffle.Count < items.Count)
            {
                if (flip)
                {
                    perfectShuffle.Add(items[index]);
                    index += middle;
                }
                else
                {
                    perfectShuffle.Add(items[index]);
                    index -= middle - 1;
                }
                flip = !flip;
            }
            return perfectShuffle;
        }
    }
}