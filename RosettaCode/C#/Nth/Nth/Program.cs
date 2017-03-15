using System;

namespace Nth
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            for (int i = 0; i < 100; i++)
            {
                Console.WriteLine(String.Format("{0}'{1}", i, getSuffix(i)));
            }
        }

        public static string getSuffix(int value)
        {
            String suffix = "th";
            if (value % 100 / 10 == 1) return suffix;
            switch (value % 10)
            {
                case 1: suffix = "st"; break;
                case 2: suffix = "nd"; break;
                case 3: suffix = "rd"; break;
            }
            return suffix;
        }
    }
}