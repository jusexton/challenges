using System;
using System.Linq;

namespace ImgurLinkGeneration
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            foreach (var arg in args.Select(long.Parse))
            {
                Console.WriteLine($"Base 10: {arg}, Base 62: {arg.ToBase62()}");
            }
        }
    }
}
