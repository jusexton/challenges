using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Goldilocks
{
    public class Program
    {
        private static void Main(string[] args)
        {
            Console.WriteLine(string.Join(",", NextGoodSeat(args[0]).Select(x => x.ToString()).ToArray()));
        }

        private static IEnumerable<int> NextGoodSeat(string filePath)
        {
            StreamReader reader = new StreamReader(filePath);
            int[] goldiProperties = Array.ConvertAll(reader.ReadLine().Split(' '), s => int.Parse(s));
            int seatIndex = 1;
            while (reader.Peek() > -1)
            {
                int[] chairProperties = Array.ConvertAll(reader.ReadLine().Split(' '), s => int.Parse(s));
                if ((goldiProperties[0] <= chairProperties[0]) && goldiProperties[1] >= chairProperties[1])
                {
                    yield return seatIndex;
                }
                seatIndex++;
            }
        }
    }
}
