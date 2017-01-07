using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

/// <summary>
/// Inspired by r/dailyprogrammer
/// https://www.reddit.com/r/dailyprogrammer/comments/5bn0b7/20161107_challenge_291_easy_goldilocks_bear/
/// Difficulty: Easy
/// </summary>
namespace Goldilocks
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine(string.Join(",", NextGoodSeat(args[0]).Select(x => x.ToString()).ToArray()));
        }

        private static IEnumerable<int> NextGoodSeat(string filePath)
        {
            StreamReader reader = new StreamReader(filePath);
            int[] goldiProperties = SplitAndParse(reader.ReadLine());
            int seatIndex = 1;
            while (reader.Peek() > -1)
            {
                int[] chairProperties = SplitAndParse(reader.ReadLine());
                if ((goldiProperties[0] <= chairProperties[0]) && goldiProperties[1] >= chairProperties[1])
                {
                    yield return seatIndex;
                }
                seatIndex++;
            }
            reader.Close();
        }

        private static int[] SplitAndParse(string line)
        {
            return Array.ConvertAll(line.Split(' '), x => int.Parse(x));
        }
    }
}
