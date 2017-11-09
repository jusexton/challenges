using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace CarRenting
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            var rentalRecords = RentalRecordLoader.Load("rentals.txt");
            var result = RentalRecordOptimizer.CalculateMostEfficientRecords(rentalRecords);

            Console.WriteLine($"Total Records: {result.Count}");
            result.ForEach(r => Console.WriteLine($"{r.StartDay} : {r.EndDay}"));
        }
    }
}
